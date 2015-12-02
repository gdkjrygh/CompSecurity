.class public Lcom/qihoo/security/clearengine/sdk/a/c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/opti/i/plugins/ISharedPreferences;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/clearengine/sdk/a/c$a;
    }
.end annotation


# static fields
.field private static b:Lcom/qihoo360/mobilesafe/share/b;


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/qihoo/security/clearengine/sdk/a/c;->a:Landroid/content/Context;

    .line 19
    invoke-static {}, Lcom/qihoo360/mobilesafe/share/b;->a()Lcom/qihoo360/mobilesafe/share/b;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/clearengine/sdk/a/c;->b:Lcom/qihoo360/mobilesafe/share/b;

    .line 20
    return-void
.end method

.method static synthetic a()Lcom/qihoo360/mobilesafe/share/b;
    .locals 1

    .prologue
    .line 15
    sget-object v0, Lcom/qihoo/security/clearengine/sdk/a/c;->b:Lcom/qihoo360/mobilesafe/share/b;

    return-object v0
.end method


# virtual methods
.method public getDefaultSharedPreferences()Landroid/content/SharedPreferences;
    .locals 3

    .prologue
    .line 24
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a/c$a;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/c;->a:Landroid/content/Context;

    const-string/jumbo v2, "sp_clear_sdk"

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/clearengine/sdk/a/c$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method public getSharedPreferences(Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 2

    .prologue
    .line 29
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/a/c$a;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/sdk/a/c;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lcom/qihoo/security/clearengine/sdk/a/c$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method
