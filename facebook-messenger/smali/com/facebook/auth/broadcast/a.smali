.class public Lcom/facebook/auth/broadcast/a;
.super Ljava/lang/Object;
.source "AuthBroadcastUtil.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const-class v0, Lcom/facebook/auth/broadcast/a;

    sput-object v0, Lcom/facebook/auth/broadcast/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Intent;)Lcom/facebook/config/a/d;
    .locals 4
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 21
    const-string v0, "extra_product"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 23
    const/4 v0, 0x0

    .line 25
    :try_start_0
    invoke-static {v1}, Lcom/facebook/config/a/d;->valueOf(Ljava/lang/String;)Lcom/facebook/config/a/d;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 33
    :goto_0
    return-object v0

    .line 26
    :catch_0
    move-exception v1

    .line 27
    sget-object v2, Lcom/facebook/auth/broadcast/a;->a:Ljava/lang/Class;

    const-string v3, "NullPointerException getting login action product."

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 28
    :catch_1
    move-exception v1

    .line 29
    sget-object v2, Lcom/facebook/auth/broadcast/a;->a:Ljava/lang/Class;

    const-string v3, "IllegalArgumentException getting login action product. This is caused by receiving a broadcast from an app this version hasn\'t heard of."

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
