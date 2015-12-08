.class public Lcom/googlecode/flickrjandroid/photos/comments/Comment;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0xcL


# instance fields
.field author:Ljava/lang/String;

.field authorName:Ljava/lang/String;

.field dateCreate:Ljava/util/Date;

.field iconFarm:I

.field iconServer:I

.field id:Ljava/lang/String;

.field permaLink:Ljava/lang/String;

.field text:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAuthor()Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->author:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthorName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->authorName:Ljava/lang/String;

    return-object v0
.end method

.method public getDateCreate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->dateCreate:Ljava/util/Date;

    return-object v0
.end method

.method public getIconFarm()I
    .locals 1

    .prologue
    .line 68
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->iconFarm:I

    return v0
.end method

.method public getIconServer()I
    .locals 1

    .prologue
    .line 54
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->iconServer:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getPermaLink()Ljava/lang/String;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->permaLink:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->text:Ljava/lang/String;

    return-object v0
.end method

.method public setAuthor(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->author:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public setAuthorName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->authorName:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public setDateCreate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->dateCreate:Ljava/util/Date;

    .line 92
    return-void
.end method

.method public setIconFarm(I)V
    .locals 0

    .prologue
    .line 76
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->iconFarm:I

    .line 77
    return-void
.end method

.method public setIconServer(I)V
    .locals 0

    .prologue
    .line 62
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->iconServer:I

    .line 63
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->id:Ljava/lang/String;

    .line 106
    return-void
.end method

.method public setPermaLink(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->permaLink:Ljava/lang/String;

    .line 119
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 132
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/comments/Comment;->text:Ljava/lang/String;

    .line 133
    return-void
.end method
