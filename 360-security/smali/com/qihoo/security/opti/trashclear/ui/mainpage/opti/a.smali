.class public Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;,
        Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;
    }
.end annotation


# static fields
.field private static a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->c:Ljava/util/HashMap;

    .line 42
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->d:Ljava/util/Map;

    .line 38
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->b:Landroid/content/Context;

    .line 39
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->b:Landroid/content/Context;

    return-object v0
.end method

.method public static a()Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;
    .locals 1

    .prologue
    .line 31
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    if-nez v0, :cond_0

    .line 32
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    invoke-direct {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;-><init>()V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    .line 34
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 129
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->d:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 45
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p1, :cond_1

    .line 67
    :cond_0
    :goto_0
    return-void

    .line 48
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->d:Ljava/util/Map;

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 49
    const/4 v1, 0x0

    .line 50
    if-eqz v0, :cond_4

    .line 51
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 54
    :goto_1
    if-eqz v0, :cond_2

    .line 55
    invoke-interface {p1, v0, p3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 59
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;

    .line 60
    if-nez v0, :cond_3

    .line 61
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;-><init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->c([Ljava/lang/Object;)Lcom/android/core/AsyncTask;

    .line 63
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 65
    :cond_3
    invoke-virtual {v0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$b;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v0, v1

    goto :goto_1
.end method
