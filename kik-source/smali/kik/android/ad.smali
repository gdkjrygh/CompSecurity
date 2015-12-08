.class final Lkik/android/ad;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/KikNotificationHandler;


# direct methods
.method constructor <init>(Lkik/android/KikNotificationHandler;)V
    .locals 0

    .prologue
    .line 982
    iput-object p1, p0, Lkik/android/ad;->a:Lkik/android/KikNotificationHandler;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 982
    iget-object v0, p0, Lkik/android/ad;->a:Lkik/android/KikNotificationHandler;

    invoke-static {v0}, Lkik/android/KikNotificationHandler;->d(Lkik/android/KikNotificationHandler;)Lcom/kik/g/p;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/ad;->a:Lkik/android/KikNotificationHandler;

    invoke-static {v0}, Lkik/android/KikNotificationHandler;->d(Lkik/android/KikNotificationHandler;)Lcom/kik/g/p;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
