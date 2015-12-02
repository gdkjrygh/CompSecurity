.class public Lcom/facebook/ui/d/a;
.super Ljava/lang/Object;
.source "ErrorDialogBuilder.java"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/ui/d/d;

.field private final c:Lcom/facebook/analytics/av;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Lcom/facebook/fbservice/service/ServiceException;

.field private g:Landroid/content/DialogInterface$OnClickListener;

.field private h:Landroid/app/Activity;

.field private i:Landroid/support/v4/app/DialogFragment;

.field private j:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/config/a/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/ui/d/d;Ljavax/inject/a;Lcom/facebook/analytics/av;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/ui/d/d;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/config/a/b;",
            ">;",
            "Lcom/facebook/analytics/av;",
            ")V"
        }
    .end annotation

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/facebook/ui/d/a;->a:Landroid/content/Context;

    .line 52
    iput-object p2, p0, Lcom/facebook/ui/d/a;->b:Lcom/facebook/ui/d/d;

    .line 53
    iput-object p3, p0, Lcom/facebook/ui/d/a;->j:Ljavax/inject/a;

    .line 54
    iput-object p4, p0, Lcom/facebook/ui/d/a;->c:Lcom/facebook/analytics/av;

    .line 55
    return-void
.end method

.method static synthetic a(Lcom/facebook/ui/d/a;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/ui/d/a;->h:Landroid/app/Activity;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/facebook/ui/d/a;
    .locals 5

    .prologue
    .line 38
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 39
    new-instance v2, Lcom/facebook/ui/d/a;

    const-class v0, Lcom/facebook/ui/d/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/d/d;

    const-class v3, Lcom/facebook/config/a/b;

    invoke-virtual {v1, v3}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v4}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/av;

    invoke-direct {v2, p0, v0, v3, v1}, Lcom/facebook/ui/d/a;-><init>(Landroid/content/Context;Lcom/facebook/ui/d/d;Ljavax/inject/a;Lcom/facebook/analytics/av;)V

    return-object v2
.end method

.method static synthetic b(Lcom/facebook/ui/d/a;)Landroid/support/v4/app/DialogFragment;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/ui/d/a;->i:Landroid/support/v4/app/DialogFragment;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/ui/d/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/ui/d/a;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/ui/d/a;)Lcom/facebook/fbservice/service/ServiceException;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/ui/d/a;->f:Lcom/facebook/fbservice/service/ServiceException;

    return-object v0
.end method


# virtual methods
.method public a()Landroid/app/AlertDialog;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 99
    iget-object v0, p0, Lcom/facebook/ui/d/a;->f:Lcom/facebook/fbservice/service/ServiceException;

    if-eqz v0, :cond_4

    .line 100
    iget-object v0, p0, Lcom/facebook/ui/d/a;->b:Lcom/facebook/ui/d/d;

    iget-object v1, p0, Lcom/facebook/ui/d/a;->f:Lcom/facebook/fbservice/service/ServiceException;

    invoke-virtual {v0, v1, v2, v2}, Lcom/facebook/ui/d/d;->a(Lcom/facebook/fbservice/service/ServiceException;ZZ)Ljava/lang/String;

    move-result-object v0

    .line 101
    if-nez v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/facebook/ui/d/a;->e:Ljava/lang/String;

    .line 107
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 108
    iget-object v0, p0, Lcom/facebook/ui/d/a;->a:Landroid/content/Context;

    sget v1, Lcom/facebook/o;->generic_error_message:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 111
    :cond_1
    iget-object v1, p0, Lcom/facebook/ui/d/a;->g:Landroid/content/DialogInterface$OnClickListener;

    .line 112
    if-nez v1, :cond_2

    .line 113
    new-instance v1, Lcom/facebook/ui/d/b;

    invoke-direct {v1, p0}, Lcom/facebook/ui/d/b;-><init>(Lcom/facebook/ui/d/a;)V

    .line 127
    :cond_2
    new-instance v2, Lcom/facebook/ui/d/c;

    invoke-direct {v2, p0}, Lcom/facebook/ui/d/c;-><init>(Lcom/facebook/ui/d/a;)V

    .line 139
    new-instance v3, Landroid/app/AlertDialog$Builder;

    iget-object v4, p0, Lcom/facebook/ui/d/a;->a:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 140
    iget-object v4, p0, Lcom/facebook/ui/d/a;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 141
    invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 143
    iget-object v0, p0, Lcom/facebook/ui/d/a;->a:Landroid/content/Context;

    sget v4, Lcom/facebook/o;->dialog_ok:I

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 144
    iget-object v0, p0, Lcom/facebook/ui/d/a;->f:Lcom/facebook/fbservice/service/ServiceException;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/ui/d/a;->j:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/b;->PUBLIC:Lcom/facebook/config/a/b;

    if-eq v0, v1, :cond_3

    .line 146
    iget-object v0, p0, Lcom/facebook/ui/d/a;->a:Landroid/content/Context;

    sget v1, Lcom/facebook/o;->report_error_button:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 150
    :cond_3
    iget-object v0, p0, Lcom/facebook/ui/d/a;->c:Lcom/facebook/analytics/av;

    const-string v1, "error_dialog"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/analytics/av;->a(Ljava/lang/String;Z)V

    .line 152
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 153
    invoke-static {v0}, Lcom/facebook/base/b/a;->a(Landroid/app/Dialog;)V

    .line 154
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 155
    return-object v0

    .line 105
    :cond_4
    iget-object v0, p0, Lcom/facebook/ui/d/a;->e:Ljava/lang/String;

    goto :goto_0
.end method

.method public a(I)Lcom/facebook/ui/d/a;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/ui/d/a;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/d/a;->d:Ljava/lang/String;

    .line 64
    return-object p0
.end method

.method public a(Landroid/app/Activity;)Lcom/facebook/ui/d/a;
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/facebook/ui/d/a;->h:Landroid/app/Activity;

    .line 89
    return-object p0
.end method

.method public a(Landroid/content/DialogInterface$OnClickListener;)Lcom/facebook/ui/d/a;
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/facebook/ui/d/a;->g:Landroid/content/DialogInterface$OnClickListener;

    .line 84
    return-object p0
.end method

.method public a(Landroid/support/v4/app/DialogFragment;)Lcom/facebook/ui/d/a;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/facebook/ui/d/a;->i:Landroid/support/v4/app/DialogFragment;

    .line 94
    return-object p0
.end method

.method public a(Lcom/facebook/fbservice/service/ServiceException;)Lcom/facebook/ui/d/a;
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/ui/d/a;->f:Lcom/facebook/fbservice/service/ServiceException;

    .line 79
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/ui/d/a;
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/ui/d/a;->d:Ljava/lang/String;

    .line 59
    return-object p0
.end method

.method public b(I)Lcom/facebook/ui/d/a;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/ui/d/a;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/d/a;->e:Ljava/lang/String;

    .line 74
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/ui/d/a;
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/facebook/ui/d/a;->e:Ljava/lang/String;

    .line 69
    return-object p0
.end method
