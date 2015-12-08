.class public final Lcom/roidapp/cloudlib/ads/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jirbo/adcolony/AdColonyAdAvailabilityListener;


# static fields
.field private static a:Lcom/roidapp/cloudlib/ads/a;


# instance fields
.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/ads/a;->b:Z

    return-void
.end method

.method public static a()Lcom/roidapp/cloudlib/ads/a;
    .locals 1

    .prologue
    .line 10
    sget-object v0, Lcom/roidapp/cloudlib/ads/a;->a:Lcom/roidapp/cloudlib/ads/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/roidapp/cloudlib/ads/a;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/ads/a;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/ads/a;->a:Lcom/roidapp/cloudlib/ads/a;

    .line 11
    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/ads/a;->a:Lcom/roidapp/cloudlib/ads/a;

    return-object v0
.end method

.method public static b()Z
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/roidapp/cloudlib/ads/a;->a:Lcom/roidapp/cloudlib/ads/a;

    if-nez v0, :cond_0

    .line 16
    const/4 v0, 0x0

    .line 17
    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/roidapp/cloudlib/ads/a;->a:Lcom/roidapp/cloudlib/ads/a;

    iget-boolean v0, v0, Lcom/roidapp/cloudlib/ads/a;->b:Z

    goto :goto_0
.end method


# virtual methods
.method public final onAdColonyAdAvailabilityChange(ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/ads/a;->b:Z

    .line 26
    return-void
.end method
