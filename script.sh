#!/bin/bash
# I have filtered all the API names with args for each permission in files like: api-GET_ACCOUNTS.txt
# Further the just API names are in func-GET_ACCOUNTS.txt
# The unique names sorted list is in 1-GET_ACCOUNTS.txt
# With this script, the 1st arg is : API list file name like 1-GET_ACCOUNTS.txt
# 2nd arg i will pass is the firectory name of app source, where i will grep for all api names
# and save its result in 3rd argument that i'll pass.

IFS=$'\n'       # make newlines the only separator
set -f          # disable globbing
echo " ================== Application: $2 ===============" >> $3
echo " ================== Permission APIs list :  $1 ===============" >> $3
for i in $(cat "$1"); do
  count=$(grep -nri "\<$i\>" $2 | wc -l)
  if [ $count -ne 0 ];
  then
    echo "$i" >> $3
  fi
done
