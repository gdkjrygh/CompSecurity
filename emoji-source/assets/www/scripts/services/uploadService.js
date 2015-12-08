'use strict';

angular.module('uploadService', [])
    .factory('Uploads', function ($http, $sce){
        var post = function (imageData) {
            console.log('>>> Uploads > Post ... with imageData: ' + imageData);

            // Unsecure version of posting to AWS
            var s3URI = encodeURI("http://uploads.staging.bitstrips.com.s3.amazonaws.com/"),
                policyBase64 = "eyJleHBpcmF0aW9uIjoiMjAyMC0xMi0zMVQxMjowMDowMC4wMDBaIiwiY29uZGl0aW9ucyI6W3siYnVja2V0IjoidXBsb2Fkcy5zdGFnaW5nLmJpdHN0cmlwcy5jb20ifSxbInN0YXJ0cy13aXRoIiwiJGtleSIsInVwbG9hZHMvIl0seyJhY2wiOiJwdWJsaWMtcmVhZCJ9LFsic3RhcnRzLXdpdGgiLCIkQ29udGVudC1UeXBlIiwiIl0sWyJjb250ZW50LWxlbmd0aC1yYW5nZSIsMCw1MjQyODgwMDBdXX0=",
                signature = "4aX56RajlsJVG2zhf33hsvKHWdw=",
                awsKey = 'AKIAJSYZEKCAEMRYZFLA',
                // acl = [ "eq", "$acl", "public-read" ], // this?, or:
                acl = "public-read";

            $http.post(s3URI, {
                "key": "uploads/",
                "policy": policyBase64,
                "AWSAccessKeyId": awsKey,
                "Content-Type": "image/png",
                "signature": signature,
                "acl": acl,
                "file": imageData // file must be last for s3
            }).then(function (response) {
                console.log('>>> success');
                console.log(response);
            }, function (error) {
                console.log('>>> error');
                console.log(error);
            });
        };

        return {
            post: post
        };
    });
