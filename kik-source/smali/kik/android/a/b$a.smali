.class final Lkik/android/a/b$a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/a/b;


# direct methods
.method private constructor <init>(Lkik/android/a/b;)V
    .locals 0

    .prologue
    .line 302
    iput-object p1, p0, Lkik/android/a/b$a;->a:Lkik/android/a/b;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lkik/android/a/b;B)V
    .locals 0

    .prologue
    .line 302
    invoke-direct {p0, p1}, Lkik/android/a/b$a;-><init>(Lkik/android/a/b;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 307
    iget-object v0, p0, Lkik/android/a/b$a;->a:Lkik/android/a/b;

    invoke-static {v0}, Lkik/android/a/b;->a(Lkik/android/a/b;)Lkik/android/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/a/a;->b()V

    .line 308
    return-void
.end method
