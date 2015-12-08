.class public final Lcom/roidapp/photogrid/b/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/f/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;I)V
    .locals 4

    .prologue
    .line 20
    const-string v0, "page_name=%s&action_type=%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-static {}, Lcom/roidapp/photogrid/b/e;->a()Lcom/cm/kinfoc/a/e;

    .line 24
    invoke-static {}, Lcom/cm/kinfoc/s;->a()Lcom/cm/kinfoc/s;

    move-result-object v1

    const-string v2, "grid_social_activity"

    invoke-virtual {v1, v2, v0}, Lcom/cm/kinfoc/s;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    return-void
.end method
