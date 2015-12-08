.class public Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public genreList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/onlinemusic/Genre;",
            ">;"
        }
    .end annotation
.end field

.field public localPageList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/onlinemusic/Genre;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->genreList:Ljava/util/ArrayList;

    .line 14
    iput-object p2, p0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    .line 15
    return-void
.end method
