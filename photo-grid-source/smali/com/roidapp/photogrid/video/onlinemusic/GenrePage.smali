.class public Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public count:I

.field public id:I

.field public lasttime:Ljava/lang/String;

.field public md5:Ljava/lang/String;

.field public url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;->url:Ljava/lang/String;

    .line 15
    iput p2, p0, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;->id:I

    .line 16
    iput p3, p0, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;->count:I

    .line 17
    iput-object p4, p0, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;->lasttime:Ljava/lang/String;

    .line 18
    iput-object p5, p0, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;->md5:Ljava/lang/String;

    .line 19
    return-void
.end method
