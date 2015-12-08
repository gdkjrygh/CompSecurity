.class public final Lcom/roidapp/photogrid/release/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/c;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/c;)V
    .locals 0

    .prologue
    .line 703
    iput-object p1, p0, Lcom/roidapp/photogrid/release/o;->a:Lcom/roidapp/photogrid/release/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .prologue
    .line 703
    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/File;

    .line 1705
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 1707
    const/4 v0, -0x1

    :goto_0
    return v0

    .line 1710
    :cond_0
    const/4 v0, 0x1

    .line 703
    goto :goto_0
.end method
