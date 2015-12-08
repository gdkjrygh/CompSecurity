.class public final Lkik/android/chat/fragment/bv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a;


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:La/a;

.field private final c:Ljavax/inject/Provider;

.field private final d:Ljavax/inject/Provider;

.field private final e:Ljavax/inject/Provider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 10
    const-class v0, Lkik/android/chat/fragment/bv;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lkik/android/chat/fragment/bv;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    sget-boolean v0, Lkik/android/chat/fragment/bv;->a:Z

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 19
    :cond_0
    iput-object p1, p0, Lkik/android/chat/fragment/bv;->b:La/a;

    .line 20
    sget-boolean v0, Lkik/android/chat/fragment/bv;->a:Z

    if-nez v0, :cond_1

    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 21
    :cond_1
    iput-object p2, p0, Lkik/android/chat/fragment/bv;->c:Ljavax/inject/Provider;

    .line 22
    sget-boolean v0, Lkik/android/chat/fragment/bv;->a:Z

    if-nez v0, :cond_2

    if-nez p3, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 23
    :cond_2
    iput-object p3, p0, Lkik/android/chat/fragment/bv;->d:Ljavax/inject/Provider;

    .line 24
    sget-boolean v0, Lkik/android/chat/fragment/bv;->a:Z

    if-nez v0, :cond_3

    if-nez p4, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 25
    :cond_3
    iput-object p4, p0, Lkik/android/chat/fragment/bv;->e:Ljavax/inject/Provider;

    .line 26
    return-void
.end method

.method public static a(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)La/a;
    .locals 1

    .prologue
    .line 40
    new-instance v0, Lkik/android/chat/fragment/bv;

    invoke-direct {v0, p0, p1, p2, p3}, Lkik/android/chat/fragment/bv;-><init>(La/a;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 10
    check-cast p1, Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Cannot inject members into a null reference"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/bv;->b:La/a;

    invoke-interface {v0, p1}, La/a;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/chat/fragment/bv;->c:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/android/a;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->a:Lcom/kik/android/a;

    iget-object v0, p0, Lkik/android/chat/fragment/bv;->d:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/r;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->b:Lkik/a/e/r;

    iget-object v0, p0, Lkik/android/chat/fragment/bv;->e:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/e/l;

    iput-object v0, p1, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->c:Lkik/a/e/l;

    return-void
.end method
