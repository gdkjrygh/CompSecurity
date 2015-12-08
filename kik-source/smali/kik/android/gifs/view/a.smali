.class public final Lkik/android/gifs/view/a;
.super Landroid/graphics/drawable/AnimationDrawable;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V

    .line 32
    iput-object p1, p0, Lkik/android/gifs/view/a;->a:Ljava/lang/String;

    .line 33
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/gifs/view/a;->setOneShot(Z)V

    .line 34
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lkik/android/gifs/view/a;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/io/File;ILkik/android/gifs/a/f$a;Landroid/content/res/Resources;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 27
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    invoke-static {}, Lkik/android/gifs/b/e;->a()Lkik/android/gifs/b/e;

    move-result-object v1

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, p3, p2}, Lkik/android/gifs/b/e;->a(Ljava/lang/String;Lkik/android/gifs/a/f$a;I)Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lkik/android/gifs/view/b;

    invoke-direct {v2, p0, p4, v0}, Lkik/android/gifs/view/b;-><init>(Ljava/lang/String;Landroid/content/res/Resources;Lcom/kik/g/p;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lkik/android/gifs/view/a;->a:Ljava/lang/String;

    return-object v0
.end method
