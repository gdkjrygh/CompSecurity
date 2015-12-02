.class public Lcom/qihoo/security/v5/UpdateService$a;
.super Landroid/os/Binder;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v5/UpdateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/UpdateService;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/v5/UpdateService;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/qihoo/security/v5/UpdateService$a;->a:Lcom/qihoo/security/v5/UpdateService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/qihoo/security/v5/UpdateService;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService$a;->a:Lcom/qihoo/security/v5/UpdateService;

    return-object v0
.end method
