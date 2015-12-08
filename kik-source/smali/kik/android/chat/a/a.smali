.class public final Lkik/android/chat/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Long;


# instance fields
.field private b:Lkik/a/j/n;

.field private c:Lkik/a/e/v;

.field private d:Lcom/kik/g/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 20
    const-wide/16 v0, 0x3e8

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lkik/android/chat/a/a;->a:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>(Lkik/a/j/n;Lcom/kik/g/p;Lkik/a/e/v;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lkik/android/chat/a/a;->d:Lcom/kik/g/p;

    .line 29
    iput-object p1, p0, Lkik/android/chat/a/a;->b:Lkik/a/j/n;

    .line 30
    iput-object p3, p0, Lkik/android/chat/a/a;->c:Lkik/a/e/v;

    .line 31
    new-instance v0, Lkik/android/chat/a/b;

    invoke-direct {v0, p0}, Lkik/android/chat/a/b;-><init>(Lkik/android/chat/a/a;)V

    invoke-virtual {p2, v0}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 38
    return-void
.end method

.method static synthetic a(Lkik/android/chat/a/a;)V
    .locals 3

    .prologue
    .line 17
    iget-object v0, p0, Lkik/android/chat/a/a;->c:Lkik/a/e/v;

    const-string v1, "kik.android.chat.preferences.UserPreferenceManager.restored"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    return-void
.end method

.method static synthetic b(Lkik/android/chat/a/a;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lkik/android/chat/a/a;->d:Lcom/kik/g/p;

    return-object v0
.end method

.method private e()Lcom/kik/n/a/k/a;
    .locals 2

    .prologue
    .line 57
    new-instance v0, Lcom/kik/n/a/k/a;

    invoke-direct {v0}, Lcom/kik/n/a/k/a;-><init>()V

    .line 58
    invoke-virtual {p0}, Lkik/android/chat/a/a;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/n/a/k/a;->a(Ljava/lang/Boolean;)Lcom/kik/n/a/k/a;

    .line 59
    invoke-virtual {p0}, Lkik/android/chat/a/a;->b()Lcom/kik/n/a/k/a$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/n/a/k/a;->a(Lcom/kik/n/a/k/a$a;)Lcom/kik/n/a/k/a;

    .line 60
    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kik/n/a/k/a$a;)V
    .locals 4

    .prologue
    .line 42
    if-nez p1, :cond_0

    .line 47
    :goto_0
    return-void

    .line 45
    :cond_0
    iget-object v0, p0, Lkik/android/chat/a/a;->c:Lkik/a/e/v;

    const-string v1, "kik.chat.bubble.id"

    iget v2, p1, Lcom/kik/n/a/k/a$a;->w:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Integer;)Z

    .line 46
    iget-object v0, p0, Lkik/android/chat/a/a;->b:Lkik/a/j/n;

    const-string v1, "user_preferences"

    const/4 v2, 0x0

    invoke-direct {p0}, Lkik/android/chat/a/a;->e()Lcom/kik/n/a/k/a;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lkik/a/j/n;->b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;)Lcom/kik/g/p;

    goto :goto_0
.end method

.method public final a(Z)V
    .locals 5

    .prologue
    .line 51
    iget-object v0, p0, Lkik/android/chat/a/a;->c:Lkik/a/e/v;

    const-string v1, "kik.enterbutton.sends"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    .line 52
    iget-object v0, p0, Lkik/android/chat/a/a;->b:Lkik/a/j/n;

    const-string v1, "user_preferences"

    const/4 v2, 0x0

    invoke-direct {p0}, Lkik/android/chat/a/a;->e()Lcom/kik/n/a/k/a;

    move-result-object v3

    sget-object v4, Lkik/android/chat/a/a;->a:Ljava/lang/Long;

    invoke-interface {v0, v1, v2, v3, v4}, Lkik/a/j/n;->b(Ljava/lang/String;Ljava/lang/String;Lcom/b/a/n;Ljava/lang/Long;)Lcom/kik/g/p;

    .line 53
    return-void
.end method

.method public final a()Z
    .locals 2

    .prologue
    .line 65
    iget-object v0, p0, Lkik/android/chat/a/a;->c:Lkik/a/e/v;

    const-string v1, "kik.enterbutton.sends"

    invoke-interface {v0, v1}, Lkik/a/e/v;->p(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final b()Lcom/kik/n/a/k/a$a;
    .locals 3

    .prologue
    .line 70
    iget-object v0, p0, Lkik/android/chat/a/a;->c:Lkik/a/e/v;

    const-string v1, "kik.chat.bubble.id"

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->a(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/kik/n/a/k/a$a;->a(I)Lcom/kik/n/a/k/a$a;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 85
    iget-object v0, p0, Lkik/android/chat/a/a;->c:Lkik/a/e/v;

    const-string v1, "kik.android.chat.preferences.UserPreferenceManager.restored"

    invoke-interface {v0, v1}, Lkik/a/e/v;->p(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lkik/android/chat/a/a;->d:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    .line 105
    :goto_0
    return-void

    .line 90
    :cond_0
    iget-object v0, p0, Lkik/android/chat/a/a;->b:Lkik/a/j/n;

    const-string v1, "user_preferences"

    const-class v2, Lcom/kik/n/a/k/a;

    invoke-interface {v0, v1, v2}, Lkik/a/j/n;->d(Ljava/lang/String;Ljava/lang/Class;)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/a/c;

    invoke-direct {v1, p0}, Lkik/android/chat/a/c;-><init>(Lkik/android/chat/a/a;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method public final d()Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lkik/android/chat/a/a;->d:Lcom/kik/g/p;

    return-object v0
.end method
