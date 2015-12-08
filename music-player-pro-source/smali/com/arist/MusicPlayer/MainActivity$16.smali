.class Lcom/arist/MusicPlayer/MainActivity$16;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->sortMusicList(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/arist/entity/Music;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$16;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 556
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/arist/entity/Music;Lcom/arist/entity/Music;)I
    .locals 2
    .param p1, "m1"    # Lcom/arist/entity/Music;
    .param p2, "m2"    # Lcom/arist/entity/Music;

    .prologue
    .line 558
    invoke-virtual {p1}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 559
    const/4 v0, 0x1

    .line 561
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/arist/entity/Music;

    check-cast p2, Lcom/arist/entity/Music;

    invoke-virtual {p0, p1, p2}, Lcom/arist/MusicPlayer/MainActivity$16;->compare(Lcom/arist/entity/Music;Lcom/arist/entity/Music;)I

    move-result v0

    return v0
.end method
