.class public final Lcom/facebook/debug/log/l;
.super Ljava/lang/Object;
.source "WtfToken.java"


# instance fields
.field private final a:Lcom/facebook/common/p/a;


# direct methods
.method public constructor <init>()V
    .locals 5

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Lcom/facebook/common/p/a;

    invoke-static {}, Lcom/facebook/common/time/c;->b()Lcom/facebook/common/time/c;

    move-result-object v1

    const/4 v2, 0x2

    const-wide/32 v3, 0x36ee80

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/common/p/a;-><init>(Lcom/facebook/common/time/a;IJ)V

    iput-object v0, p0, Lcom/facebook/debug/log/l;->a:Lcom/facebook/common/p/a;

    .line 25
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/debug/log/l;->a:Lcom/facebook/common/p/a;

    invoke-virtual {v0}, Lcom/facebook/common/p/a;->a()Z

    move-result v0

    return v0
.end method
