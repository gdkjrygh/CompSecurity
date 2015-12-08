.class public final Lcom/kik/cards/web/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cards/web/a/a;


# static fields
.field private static a:Lorg/c/b;


# instance fields
.field private b:Landroid/app/Activity;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-string v0, "ScreenWakeLock"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cards/web/a/b;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/kik/cards/web/a/b;->b:Landroid/app/Activity;

    .line 23
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/a/b;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/kik/cards/web/a/b;->b:Landroid/app/Activity;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 27
    iget-object v0, p0, Lcom/kik/cards/web/a/b;->b:Landroid/app/Activity;

    new-instance v1, Lcom/kik/cards/web/a/c;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/a/c;-><init>(Lcom/kik/cards/web/a/b;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 36
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, Lcom/kik/cards/web/a/b;->b:Landroid/app/Activity;

    new-instance v1, Lcom/kik/cards/web/a/d;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/a/d;-><init>(Lcom/kik/cards/web/a/b;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 49
    return-void
.end method
