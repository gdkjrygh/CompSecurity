.class public abstract Lkik/android/chat/activity/KikIqActivityBase;
.super Lkik/android/chat/activity/KikActivityBase;
.source "SourceFile"

# interfaces
.implements Lkik/a/f/j;


# static fields
.field private static final f:Lorg/c/b;


# instance fields
.field private a:Lkik/a/f/f/y;

.field private e:Landroid/app/Dialog;

.field protected h:Ljava/lang/String;

.field protected i:Ljava/lang/String;

.field protected j:Lkik/a/e/f;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-string v0, "KikIqActivityBase"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/chat/activity/KikIqActivityBase;->f:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 21
    invoke-direct {p0}, Lkik/android/chat/activity/KikActivityBase;-><init>()V

    .line 24
    iput-object v0, p0, Lkik/android/chat/activity/KikIqActivityBase;->a:Lkik/a/f/f/y;

    .line 29
    iput-object v0, p0, Lkik/android/chat/activity/KikIqActivityBase;->e:Landroid/app/Dialog;

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/activity/KikIqActivityBase;->h:Ljava/lang/String;

    .line 31
    const-string v0, ""

    iput-object v0, p0, Lkik/android/chat/activity/KikIqActivityBase;->i:Ljava/lang/String;

    return-void
.end method

.method private a(Landroid/app/Dialog;)V
    .locals 1

    .prologue
    .line 71
    invoke-virtual {p0}, Lkik/android/chat/activity/KikIqActivityBase;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    iget-object v0, p0, Lkik/android/chat/activity/KikIqActivityBase;->e:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lkik/android/chat/activity/KikIqActivityBase;->e:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/activity/KikIqActivityBase;->e:Landroid/app/Dialog;

    .line 76
    :cond_0
    if-eqz p1, :cond_1

    .line 77
    iput-object p1, p0, Lkik/android/chat/activity/KikIqActivityBase;->e:Landroid/app/Dialog;

    .line 78
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 81
    :cond_1
    return-void
.end method

.method static synthetic a(Lkik/android/chat/activity/KikIqActivityBase;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 21
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p2}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    const v1, 0x7f090193

    invoke-virtual {p0, v1}, Lkik/android/chat/activity/KikIqActivityBase;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lkik/android/chat/activity/ah;

    invoke-direct {v2, p0, v0}, Lkik/android/chat/activity/ah;-><init>(Lkik/android/chat/activity/KikIqActivityBase;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog;->setButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    invoke-direct {p0, v0}, Lkik/android/chat/activity/KikIqActivityBase;->a(Landroid/app/Dialog;)V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 1

    .prologue
    .line 103
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/android/chat/activity/KikIqActivityBase;->a(Landroid/app/Dialog;)V

    .line 104
    return-void
.end method

.method protected final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 85
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 86
    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setProgressStyle(I)V

    .line 87
    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 88
    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 89
    invoke-direct {p0, v0}, Lkik/android/chat/activity/KikIqActivityBase;->a(Landroid/app/Dialog;)V

    .line 99
    return-void
.end method

.method protected a(Lkik/a/f/f/z;)V
    .locals 0

    .prologue
    .line 176
    return-void
.end method

.method public final a(Lkik/a/f/f/z;I)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 125
    iget-object v0, p0, Lkik/android/chat/activity/KikIqActivityBase;->a:Lkik/a/f/f/y;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 126
    packed-switch p2, :pswitch_data_0

    .line 157
    :goto_0
    :pswitch_0
    return-void

    .line 134
    :pswitch_1
    invoke-virtual {p0, p1}, Lkik/android/chat/activity/KikIqActivityBase;->a(Lkik/a/f/f/z;)V

    .line 135
    invoke-direct {p0, v1}, Lkik/android/chat/activity/KikIqActivityBase;->a(Landroid/app/Dialog;)V

    .line 136
    iput-object v1, p0, Lkik/android/chat/activity/KikIqActivityBase;->a:Lkik/a/f/f/y;

    goto :goto_0

    .line 139
    :pswitch_2
    invoke-virtual {p0, p1}, Lkik/android/chat/activity/KikIqActivityBase;->b(Lkik/a/f/f/z;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    new-instance v0, Lkik/android/chat/activity/ai;

    invoke-direct {v0, p0}, Lkik/android/chat/activity/ai;-><init>(Lkik/android/chat/activity/KikIqActivityBase;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikIqActivityBase;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 149
    :cond_0
    iput-object v1, p0, Lkik/android/chat/activity/KikIqActivityBase;->a:Lkik/a/f/f/y;

    goto :goto_0

    .line 155
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Dropping unexpected iq: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 126
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected b(Lkik/a/f/f/z;)Z
    .locals 1

    .prologue
    .line 191
    const/4 v0, 0x1

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 40
    invoke-super {p0, p1}, Lkik/android/chat/activity/KikActivityBase;->onCreate(Landroid/os/Bundle;)V

    .line 41
    invoke-virtual {p0}, Lkik/android/chat/activity/KikIqActivityBase;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/a;

    invoke-interface {v0}, Lkik/android/chat/a;->a()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/activity/KikIqActivityBase;)V

    .line 42
    const v0, 0x7f0902ba

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikIqActivityBase;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/activity/KikIqActivityBase;->h:Ljava/lang/String;

    .line 43
    const v0, 0x7f090383

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikIqActivityBase;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/activity/KikIqActivityBase;->i:Ljava/lang/String;

    .line 44
    return-void
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lkik/android/chat/activity/KikIqActivityBase;->e:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lkik/android/chat/activity/KikIqActivityBase;->e:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V

    .line 200
    :cond_0
    invoke-super {p0}, Lkik/android/chat/activity/KikActivityBase;->onPause()V

    .line 201
    return-void
.end method
