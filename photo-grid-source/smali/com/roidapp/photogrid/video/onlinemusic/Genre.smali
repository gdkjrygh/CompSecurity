.class public Lcom/roidapp/photogrid/video/onlinemusic/Genre;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public count:I

.field public genre_id:I

.field public genre_title:Ljava/lang/String;

.field public genre_url:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput p1, p0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->genre_id:I

    .line 23
    iput-object p2, p0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->genre_title:Ljava/lang/String;

    .line 24
    iput-object p3, p0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->genre_url:Ljava/lang/String;

    .line 25
    iput p4, p0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->count:I

    .line 26
    return-void
.end method
