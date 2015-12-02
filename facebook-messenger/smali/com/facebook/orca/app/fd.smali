.class public Lcom/facebook/orca/app/fd;
.super Ljava/lang/Object;
.source "MessengerMenuHandler.java"

# interfaces
.implements Lcom/facebook/ui/f/a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/bugreporter/g;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/analytics/av;

.field private final e:Lcom/facebook/orca/h/b;

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/facebook/auth/b/b;

.field private final h:Lcom/facebook/c/s;

.field private final i:Lcom/facebook/orca/h/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/bugreporter/g;Ljavax/inject/a;Lcom/facebook/analytics/av;Lcom/facebook/orca/h/b;Ljavax/inject/a;Lcom/facebook/auth/b/b;Lcom/facebook/c/s;Lcom/facebook/orca/h/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/bugreporter/g;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/analytics/av;",
            "Lcom/facebook/orca/h/b;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;",
            "Lcom/facebook/auth/b/b;",
            "Lcom/facebook/c/s;",
            "Lcom/facebook/orca/h/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/facebook/orca/app/fd;->a:Landroid/content/Context;

    .line 62
    iput-object p2, p0, Lcom/facebook/orca/app/fd;->b:Lcom/facebook/bugreporter/g;

    .line 63
    iput-object p3, p0, Lcom/facebook/orca/app/fd;->c:Ljavax/inject/a;

    .line 64
    iput-object p4, p0, Lcom/facebook/orca/app/fd;->d:Lcom/facebook/analytics/av;

    .line 65
    iput-object p5, p0, Lcom/facebook/orca/app/fd;->e:Lcom/facebook/orca/h/b;

    .line 66
    iput-object p6, p0, Lcom/facebook/orca/app/fd;->f:Ljavax/inject/a;

    .line 67
    iput-object p7, p0, Lcom/facebook/orca/app/fd;->g:Lcom/facebook/auth/b/b;

    .line 68
    iput-object p8, p0, Lcom/facebook/orca/app/fd;->h:Lcom/facebook/c/s;

    .line 69
    iput-object p9, p0, Lcom/facebook/orca/app/fd;->i:Lcom/facebook/orca/h/a;

    .line 70
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 129
    iget-object v0, p0, Lcom/facebook/orca/app/fd;->d:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v2, "opt_menu_item"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 132
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 135
    const-string v0, "http://m.facebook.com/mobile/messenger/help"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    .line 136
    const-string v1, "locale"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/k/a;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 137
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 138
    iget-object v0, p0, Lcom/facebook/orca/app/fd;->h:Lcom/facebook/c/s;

    iget-object v2, p0, Lcom/facebook/orca/app/fd;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 139
    return-void
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 2

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/orca/app/fd;->g:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 75
    sget v0, Lcom/facebook/l;->messenger_menu:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 77
    iget-object v0, p0, Lcom/facebook/orca/app/fd;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-eq v0, v1, :cond_0

    .line 78
    sget v0, Lcom/facebook/i;->internal:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 79
    sget v0, Lcom/facebook/i;->send_log_menu_item:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 80
    sget v0, Lcom/facebook/i;->force_crash_menu_item:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 83
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/app/fd;->a:Landroid/content/Context;

    instance-of v0, v0, Landroid/preference/PreferenceActivity;

    if-eqz v0, :cond_1

    .line 84
    sget v0, Lcom/facebook/i;->preferences:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 86
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/app/fd;->a:Landroid/content/Context;

    instance-of v0, v0, Lcom/facebook/bugreporter/x;

    if-eqz v0, :cond_2

    .line 87
    sget v0, Lcom/facebook/i;->report_bug:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 89
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/app/fd;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_3

    .line 90
    sget v0, Lcom/facebook/i;->report_bug:I

    invoke-interface {p1, v0}, Landroid/view/Menu;->removeItem(I)V

    .line 95
    :cond_3
    :goto_0
    return-void

    .line 93
    :cond_4
    sget v0, Lcom/facebook/l;->messenger_menu_logged_out:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    goto :goto_0
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 99
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    .line 100
    sget v2, Lcom/facebook/i;->help:I

    if-ne v1, v2, :cond_0

    .line 101
    const-string v1, "help"

    invoke-direct {p0, v1}, Lcom/facebook/orca/app/fd;->a(Ljava/lang/String;)V

    .line 102
    invoke-virtual {p0}, Lcom/facebook/orca/app/fd;->a()V

    .line 125
    :goto_0
    return v0

    .line 104
    :cond_0
    sget v2, Lcom/facebook/i;->preferences:I

    if-ne v1, v2, :cond_1

    .line 105
    const-string v1, "preferences"

    invoke-direct {p0, v1}, Lcom/facebook/orca/app/fd;->a(Ljava/lang/String;)V

    .line 106
    invoke-virtual {p0}, Lcom/facebook/orca/app/fd;->b()V

    goto :goto_0

    .line 108
    :cond_1
    sget v2, Lcom/facebook/i;->report_bug:I

    if-ne v1, v2, :cond_3

    .line 109
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v1

    .line 110
    iget-object v2, p0, Lcom/facebook/orca/app/fd;->i:Lcom/facebook/orca/h/a;

    invoke-virtual {v2}, Lcom/facebook/orca/h/a;->a()Lcom/facebook/common/c/f;

    move-result-object v2

    .line 111
    if-eqz v2, :cond_2

    .line 112
    invoke-virtual {v2}, Lcom/facebook/common/c/f;->a()Ljava/io/File;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    .line 113
    const-string v3, "device_logs.log"

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    :cond_2
    iget-object v2, p0, Lcom/facebook/orca/app/fd;->b:Lcom/facebook/bugreporter/g;

    iget-object v3, p0, Lcom/facebook/orca/app/fd;->a:Landroid/content/Context;

    invoke-virtual {v2, v3, v1}, Lcom/facebook/bugreporter/g;->a(Landroid/content/Context;Ljava/util/Map;)V

    goto :goto_0

    .line 117
    :cond_3
    sget v2, Lcom/facebook/i;->send_log_menu_item:I

    if-ne v1, v2, :cond_4

    .line 118
    const-string v1, "send_log_menu_item"

    invoke-direct {p0, v1}, Lcom/facebook/orca/app/fd;->a(Ljava/lang/String;)V

    .line 119
    iget-object v1, p0, Lcom/facebook/orca/app/fd;->e:Lcom/facebook/orca/h/b;

    invoke-virtual {v1}, Lcom/facebook/orca/h/b;->a()V

    goto :goto_0

    .line 121
    :cond_4
    sget v0, Lcom/facebook/i;->force_crash_menu_item:I

    if-ne v1, v0, :cond_5

    .line 122
    const-string v0, "force_crash_menu_item"

    invoke-direct {p0, v0}, Lcom/facebook/orca/app/fd;->a(Ljava/lang/String;)V

    .line 123
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Forcing crash (internal)"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 125
    :cond_5
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 3

    .prologue
    .line 142
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/app/fd;->a:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/prefs/OrcaRootPreferenceActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 143
    iget-object v1, p0, Lcom/facebook/orca/app/fd;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 144
    return-void
.end method
