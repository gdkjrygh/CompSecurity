.class public Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public files:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;",
            ">;"
        }
    .end annotation
.end field

.field public genre:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;",
            ">;"
        }
    .end annotation
.end field

.field public genreNames:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/onlinemusic/Genre;",
            ">;"
        }
    .end annotation
.end field

.field public lastEdit:Ljava/lang/String;

.field public pagesize:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
