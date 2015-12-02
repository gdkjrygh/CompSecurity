.class public final Lcom/qihoo/security/ui/b/e$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/b/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/b/e;

.field private final b:I


# direct methods
.method private constructor <init>(Lcom/qihoo/security/ui/b/e;I)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/qihoo/security/ui/b/e$a;->a:Lcom/qihoo/security/ui/b/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput p2, p0, Lcom/qihoo/security/ui/b/e$a;->b:I

    .line 97
    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/ui/b/e;ILcom/qihoo/security/ui/b/e$1;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/ui/b/e$a;-><init>(Lcom/qihoo/security/ui/b/e;I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 60
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/b/e$a;->a:Lcom/qihoo/security/ui/b/e;

    invoke-static {v0}, Lcom/qihoo/security/ui/b/e;->b(Lcom/qihoo/security/ui/b/e;)Lcom/qihoo/security/ui/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/b/e$a;->a:Lcom/qihoo/security/ui/b/e;

    invoke-static {v1}, Lcom/qihoo/security/ui/b/e;->a(Lcom/qihoo/security/ui/b/e;)Landroid/os/Binder;

    move-result-object v1

    iget v2, p0, Lcom/qihoo/security/ui/b/e$a;->b:I

    invoke-interface {v0, v1, v2}, Lcom/qihoo/security/ui/b/d;->a(Landroid/os/IBinder;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    :goto_0
    return-void

    .line 61
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b()V
    .locals 3

    .prologue
    .line 87
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/b/e$a;->a:Lcom/qihoo/security/ui/b/e;

    invoke-static {v0}, Lcom/qihoo/security/ui/b/e;->b(Lcom/qihoo/security/ui/b/e;)Lcom/qihoo/security/ui/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/b/e$a;->a:Lcom/qihoo/security/ui/b/e;

    invoke-static {v1}, Lcom/qihoo/security/ui/b/e;->a(Lcom/qihoo/security/ui/b/e;)Landroid/os/Binder;

    move-result-object v1

    iget v2, p0, Lcom/qihoo/security/ui/b/e$a;->b:I

    invoke-interface {v0, v1, v2}, Lcom/qihoo/security/ui/b/d;->b(Landroid/os/IBinder;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    :goto_0
    return-void

    .line 88
    :catch_0
    move-exception v0

    goto :goto_0
.end method
