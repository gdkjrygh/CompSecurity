.class final Lcom/roidapp/photogrid/release/qa;
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
.field final synthetic a:Lcom/roidapp/photogrid/release/PickFolder;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PickFolder;)V
    .locals 0

    .prologue
    .line 359
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qa;->a:Lcom/roidapp/photogrid/release/PickFolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .prologue
    .line 362
    check-cast p1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    .line 363
    check-cast p2, Ljava/io/File;

    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    .line 364
    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    .line 365
    const/4 v0, -0x1

    .line 369
    :goto_0
    return v0

    .line 366
    :cond_0
    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 367
    const/4 v0, 0x0

    goto :goto_0

    .line 369
    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method
