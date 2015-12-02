.class public Lcom/facebook/common/r/a;
.super Ljava/lang/Object;
.source "DefaultTimeFormatUtil.java"

# interfaces
.implements Lcom/facebook/common/r/e;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/common/time/a;

.field private final c:Ljava/util/TimeZone;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/time/a;)V
    .locals 1

    .prologue
    .line 26
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/common/r/a;-><init>(Landroid/content/Context;Lcom/facebook/common/time/a;Ljava/util/TimeZone;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/time/a;Ljava/util/TimeZone;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/r/a;->a:Landroid/content/Context;

    .line 31
    iput-object p2, p0, Lcom/facebook/common/r/a;->b:Lcom/facebook/common/time/a;

    .line 32
    iput-object p3, p0, Lcom/facebook/common/r/a;->c:Ljava/util/TimeZone;

    .line 33
    return-void
.end method
