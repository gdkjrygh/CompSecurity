.class public final Lcom/roidapp/cloudlib/flickr/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field private static b:Lcom/roidapp/cloudlib/flickr/k;

.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 19
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/cloudlib/flickr/k;->b:Lcom/roidapp/cloudlib/flickr/k;

    .line 24
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v1, "Flickr"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->b(Ljava/lang/String;)Lcom/roidapp/cloudlib/ak;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/flickr/j;

    .line 25
    iget-object v1, v0, Lcom/roidapp/cloudlib/flickr/j;->f:Ljava/lang/String;

    sput-object v1, Lcom/roidapp/cloudlib/flickr/k;->c:Ljava/lang/String;

    .line 26
    iget-object v0, v0, Lcom/roidapp/cloudlib/flickr/j;->g:Ljava/lang/String;

    sput-object v0, Lcom/roidapp/cloudlib/flickr/k;->a:Ljava/lang/String;

    .line 27
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Lcom/googlecode/flickrjandroid/Flickr;
    .locals 4

    .prologue
    .line 51
    invoke-static {}, Lcom/roidapp/cloudlib/flickr/k;->b()Lcom/googlecode/flickrjandroid/Flickr;

    move-result-object v0

    .line 52
    invoke-static {}, Lcom/googlecode/flickrjandroid/RequestContext;->getRequestContext()Lcom/googlecode/flickrjandroid/RequestContext;

    move-result-object v1

    .line 53
    new-instance v2, Lcom/googlecode/flickrjandroid/oauth/OAuth;

    invoke-direct {v2}, Lcom/googlecode/flickrjandroid/oauth/OAuth;-><init>()V

    .line 54
    new-instance v3, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    invoke-direct {v3, p0, p1}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->setToken(Lcom/googlecode/flickrjandroid/oauth/OAuthToken;)V

    .line 55
    invoke-virtual {v1, v2}, Lcom/googlecode/flickrjandroid/RequestContext;->setOAuth(Lcom/googlecode/flickrjandroid/oauth/OAuth;)V

    .line 56
    return-object v0
.end method

.method public static a()Lcom/roidapp/cloudlib/flickr/k;
    .locals 1

    .prologue
    .line 34
    sget-object v0, Lcom/roidapp/cloudlib/flickr/k;->b:Lcom/roidapp/cloudlib/flickr/k;

    if-nez v0, :cond_0

    .line 35
    new-instance v0, Lcom/roidapp/cloudlib/flickr/k;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/flickr/k;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/flickr/k;->b:Lcom/roidapp/cloudlib/flickr/k;

    .line 38
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/flickr/k;->b:Lcom/roidapp/cloudlib/flickr/k;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 78
    invoke-static {p0, v0, v0, v0, v0}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    const-string v0, ""

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/common/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 81
    const-string v0, ""

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 82
    return-void
.end method

.method public static b()Lcom/googlecode/flickrjandroid/Flickr;
    .locals 4

    .prologue
    .line 43
    :try_start_0
    new-instance v0, Lcom/googlecode/flickrjandroid/Flickr;

    sget-object v1, Lcom/roidapp/cloudlib/flickr/k;->c:Ljava/lang/String;

    sget-object v2, Lcom/roidapp/cloudlib/flickr/k;->a:Ljava/lang/String;

    new-instance v3, Lcom/googlecode/flickrjandroid/REST;

    invoke-direct {v3}, Lcom/googlecode/flickrjandroid/REST;-><init>()V

    invoke-direct {v0, v1, v2, v3}, Lcom/googlecode/flickrjandroid/Flickr;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/googlecode/flickrjandroid/Transport;)V
    :try_end_0
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
