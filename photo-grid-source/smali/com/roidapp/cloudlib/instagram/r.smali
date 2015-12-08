.class public final Lcom/roidapp/cloudlib/instagram/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Ljava/lang/String;


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/instagram/m;",
            ">;"
        }
    .end annotation
.end field

.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const/16 v0, 0xc8

    iput v0, p0, Lcom/roidapp/cloudlib/instagram/r;->b:I

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/r;->a:Ljava/util/List;

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 17
    sget-object v0, Lcom/roidapp/cloudlib/instagram/r;->c:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 13
    sput-object p0, Lcom/roidapp/cloudlib/instagram/r;->c:Ljava/lang/String;

    .line 14
    return-void
.end method

.method public static b()Z
    .locals 2

    .prologue
    .line 21
    const-string v0, "false"

    sget-object v1, Lcom/roidapp/cloudlib/instagram/r;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    const/4 v0, 0x0

    .line 24
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public final a(I)Lcom/roidapp/cloudlib/instagram/m;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/r;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/instagram/m;

    return-object v0
.end method
