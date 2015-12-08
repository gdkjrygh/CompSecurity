.class Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x2288d511ce8549edL


# instance fields
.field private final accessTokenString:Ljava/lang/String;

.field private final appId:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 239
    iput-object p1, p0, Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;->accessTokenString:Ljava/lang/String;

    .line 240
    iput-object p2, p0, Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;->appId:Ljava/lang/String;

    .line 241
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/appevents/AppEventsLogger$1;)V
    .locals 0

    .prologue
    .line 233
    invoke-direct {p0, p1, p2}, Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 244
    new-instance v0, Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;

    iget-object v1, p0, Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;->accessTokenString:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1;->appId:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/facebook/appevents/AppEventsLogger$AccessTokenAppIdPair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
