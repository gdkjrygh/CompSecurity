.class public Lcom/googlecode/flickrjandroid/blogs/Blog;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private id:Ljava/math/BigDecimal;

.field private name:Ljava/lang/String;

.field private needPassword:Z

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    return-void
.end method


# virtual methods
.method public getId()Ljava/math/BigDecimal;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/blogs/Blog;->id:Ljava/math/BigDecimal;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/blogs/Blog;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/blogs/Blog;->url:Ljava/lang/String;

    return-object v0
.end method

.method public isNeedPassword()Z
    .locals 1

    .prologue
    .line 48
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/blogs/Blog;->needPassword:Z

    return v0
.end method

.method public setId(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 34
    if-eqz p1, :cond_0

    .line 35
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/blogs/Blog;->setId(Ljava/math/BigDecimal;)V

    .line 37
    :cond_0
    return-void
.end method

.method public setId(Ljava/math/BigDecimal;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/blogs/Blog;->id:Ljava/math/BigDecimal;

    .line 31
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/blogs/Blog;->name:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public setNeedPassword(Z)V
    .locals 0

    .prologue
    .line 52
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/blogs/Blog;->needPassword:Z

    .line 53
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/blogs/Blog;->url:Ljava/lang/String;

    .line 61
    return-void
.end method
