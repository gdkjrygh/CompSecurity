.class final Lcom/roidapp/photogrid/release/ky;
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
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/kt;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/kt;)V
    .locals 0

    .prologue
    .line 747
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ky;->a:Lcom/roidapp/photogrid/release/kt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .prologue
    .line 750
    check-cast p1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    .line 751
    check-cast p2, Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    .line 752
    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 753
    const/4 v0, -0x1

    .line 757
    :goto_0
    return v0

    .line 754
    :cond_0
    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 755
    const/4 v0, 0x0

    goto :goto_0

    .line 757
    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method
