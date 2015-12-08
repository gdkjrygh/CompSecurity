.class final Lkik/android/chat/activity/v;
.super Lcom/kik/b/a;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/activity/KikApiLandingActivity;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lkik/android/chat/activity/v;->a:Lkik/android/chat/activity/KikApiLandingActivity;

    invoke-direct {p0, p2}, Lcom/kik/b/a;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;Ljava/util/Map;)V
    .locals 2

    .prologue
    .line 98
    const-string v0, "username"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 99
    if-nez v0, :cond_0

    .line 100
    iget-object v0, p0, Lkik/android/chat/activity/v;->a:Lkik/android/chat/activity/KikApiLandingActivity;

    invoke-static {v0}, Lkik/android/chat/activity/KikApiLandingActivity;->a(Lkik/android/chat/activity/KikApiLandingActivity;)V

    .line 108
    :goto_0
    return-void

    .line 102
    :cond_0
    const-string v1, "me"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 103
    new-instance v0, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikPreferenceLaunchpad$a;-><init>()V

    iget-object v1, p0, Lkik/android/chat/activity/v;->a:Lkik/android/chat/activity/KikApiLandingActivity;

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0

    .line 106
    :cond_1
    iget-object v1, p0, Lkik/android/chat/activity/v;->a:Lkik/android/chat/activity/KikApiLandingActivity;

    invoke-static {v1, v0}, Lkik/android/chat/activity/KikApiLandingActivity;->a(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V

    goto :goto_0
.end method
