.class public final Lcom/roidapp/photogrid/release/pr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lcom/roidapp/photogrid/release/pr;


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ao;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 6
    new-instance v0, Lcom/roidapp/photogrid/release/pr;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/pr;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/release/pr;->a:Lcom/roidapp/photogrid/release/pr;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
.end method

.method public static a()Lcom/roidapp/photogrid/release/pr;
    .locals 1

    .prologue
    .line 12
    sget-object v0, Lcom/roidapp/photogrid/release/pr;->a:Lcom/roidapp/photogrid/release/pr;

    if-nez v0, :cond_0

    .line 13
    new-instance v0, Lcom/roidapp/photogrid/release/pr;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/pr;-><init>()V

    sput-object v0, Lcom/roidapp/photogrid/release/pr;->a:Lcom/roidapp/photogrid/release/pr;

    .line 15
    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/release/pr;->a:Lcom/roidapp/photogrid/release/pr;

    return-object v0
.end method

.method public static c()V
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/release/pr;->a:Lcom/roidapp/photogrid/release/pr;

    .line 25
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ao;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 21
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pr;->b:Ljava/util/List;

    .line 22
    return-void
.end method

.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ao;",
            ">;"
        }
    .end annotation

    .prologue
    .line 18
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pr;->b:Ljava/util/List;

    return-object v0
.end method
