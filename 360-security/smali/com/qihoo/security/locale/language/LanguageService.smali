.class public Lcom/qihoo/security/locale/language/LanguageService;
.super Lcom/qihoo/security/app/UiProcessService;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/locale/language/LanguageService$a;
    }
.end annotation


# instance fields
.field private final c:Landroid/os/IBinder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/qihoo/security/app/UiProcessService;-><init>()V

    .line 20
    new-instance v0, Lcom/qihoo/security/locale/language/LanguageService$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/locale/language/LanguageService$a;-><init>(Lcom/qihoo/security/locale/language/LanguageService;)V

    iput-object v0, p0, Lcom/qihoo/security/locale/language/LanguageService;->c:Landroid/os/IBinder;

    .line 22
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/qihoo/security/locale/language/LanguageService;->c:Landroid/os/IBinder;

    return-object v0
.end method

.method public onCreate()V
    .locals 1

    .prologue
    .line 35
    invoke-super {p0}, Lcom/qihoo/security/app/UiProcessService;->onCreate()V

    .line 36
    invoke-virtual {p0}, Lcom/qihoo/security/locale/language/LanguageService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/locale/language/LanguageService;->b:Landroid/content/Context;

    .line 37
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x1

    return v0
.end method
