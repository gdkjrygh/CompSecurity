.class public Lcom/googlecode/flickrjandroid/RequestContext;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static threadLocal:Lcom/googlecode/flickrjandroid/a;


# instance fields
.field private auth:Lcom/googlecode/flickrjandroid/oauth/OAuth;

.field private extras:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 26
    new-instance v0, Lcom/googlecode/flickrjandroid/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/googlecode/flickrjandroid/a;-><init>(B)V

    .line 25
    sput-object v0, Lcom/googlecode/flickrjandroid/RequestContext;->threadLocal:Lcom/googlecode/flickrjandroid/a;

    .line 26
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getRequestContext()Lcom/googlecode/flickrjandroid/RequestContext;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/googlecode/flickrjandroid/RequestContext;->threadLocal:Lcom/googlecode/flickrjandroid/a;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/flickrjandroid/RequestContext;

    return-object v0
.end method

.method public static resetThreadLocals()V
    .locals 1

    .prologue
    .line 41
    sget-object v0, Lcom/googlecode/flickrjandroid/RequestContext;->threadLocal:Lcom/googlecode/flickrjandroid/a;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/a;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 42
    sget-object v0, Lcom/googlecode/flickrjandroid/RequestContext;->threadLocal:Lcom/googlecode/flickrjandroid/a;

    invoke-virtual {v0}, Lcom/googlecode/flickrjandroid/a;->remove()V

    .line 44
    :cond_0
    return-void
.end method


# virtual methods
.method public getExtras()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 61
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/RequestContext;->extras:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/RequestContext;->extras:Ljava/util/List;

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/RequestContext;->extras:Ljava/util/List;

    return-object v0
.end method

.method public getOAuth()Lcom/googlecode/flickrjandroid/oauth/OAuth;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/RequestContext;->auth:Lcom/googlecode/flickrjandroid/oauth/OAuth;

    return-object v0
.end method

.method public setExtras(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 66
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/RequestContext;->extras:Ljava/util/List;

    .line 67
    return-void
.end method

.method public setOAuth(Lcom/googlecode/flickrjandroid/oauth/OAuth;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/RequestContext;->auth:Lcom/googlecode/flickrjandroid/oauth/OAuth;

    .line 53
    return-void
.end method
