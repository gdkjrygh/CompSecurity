.class public Lcom/facebook/prefs/shared/t;
.super Lcom/facebook/inject/c;
.source "FbSharedPreferencesModule.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 43
    const-string v0, "com.facebook.orca_preferences"

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/prefs/shared/t;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/facebook/prefs/shared/t;->a:Ljava/lang/String;

    .line 38
    iput-object p2, p0, Lcom/facebook/prefs/shared/t;->b:Ljava/lang/String;

    .line 39
    iput-object p3, p0, Lcom/facebook/prefs/shared/t;->c:Ljava/lang/String;

    .line 40
    return-void
.end method

.method static synthetic a(Lcom/facebook/prefs/shared/t;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/prefs/shared/t;->c:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method protected a()V
    .locals 4

    .prologue
    .line 48
    const-class v0, Lcom/facebook/d/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/t;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 50
    const-class v0, Landroid/content/SharedPreferences;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/t;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/prefs/shared/DefaultSharedPreferences;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/prefs/shared/v;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/prefs/shared/v;-><init>(Lcom/facebook/prefs/shared/t;Lcom/facebook/prefs/shared/u;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 54
    const-class v0, Lcom/facebook/prefs/shared/j;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/t;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/prefs/shared/q;

    invoke-direct {v1}, Lcom/facebook/prefs/shared/q;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 57
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/t;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/prefs/shared/j;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 58
    const-class v0, Lcom/facebook/prefs/shared/h;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/t;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/prefs/shared/h;

    iget-object v2, p0, Lcom/facebook/prefs/shared/t;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/prefs/shared/t;->b:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/facebook/prefs/shared/h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Object;)V

    .line 60
    const-class v0, Lcom/facebook/prefs/shared/ah;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/t;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/prefs/shared/ai;

    invoke-direct {v1}, Lcom/facebook/prefs/shared/ai;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 63
    const-class v0, Lcom/facebook/prefs/shared/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/t;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/prefs/shared/ab;

    invoke-direct {v1}, Lcom/facebook/prefs/shared/ab;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 66
    const-class v0, Lcom/facebook/prefs/shared/r;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/t;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/prefs/shared/s;

    invoke-direct {v1}, Lcom/facebook/prefs/shared/s;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 68
    const-class v0, Lcom/facebook/prefs/shared/w;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/t;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/prefs/shared/x;

    invoke-direct {v1}, Lcom/facebook/prefs/shared/x;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 71
    const-class v0, Lcom/facebook/prefs/shared/y;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/t;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/prefs/shared/z;

    invoke-direct {v1}, Lcom/facebook/prefs/shared/z;-><init>()V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 74
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/prefs/shared/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/prefs/shared/r;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 78
    const-class v0, Lcom/facebook/prefs/shared/ad;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/t;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 79
    const-class v0, Lcom/facebook/prefs/shared/ac;

    invoke-virtual {p0, v0}, Lcom/facebook/prefs/shared/t;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 80
    return-void
.end method
