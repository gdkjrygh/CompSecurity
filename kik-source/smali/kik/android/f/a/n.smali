.class final Lkik/android/f/a/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lkik/android/f/a/m;


# direct methods
.method constructor <init>(Lkik/android/f/a/m;Ljava/lang/String;Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 1386
    iput-object p1, p0, Lkik/android/f/a/n;->c:Lkik/android/f/a/m;

    iput-object p2, p0, Lkik/android/f/a/n;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/android/f/a/n;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 1391
    iget-object v0, p0, Lkik/android/f/a/n;->a:Ljava/lang/String;

    iget-object v1, p0, Lkik/android/f/a/n;->b:Landroid/app/Activity;

    iget-object v2, p0, Lkik/android/f/a/n;->c:Lkik/android/f/a/m;

    iget-object v2, v2, Lkik/android/f/a/m;->b:Lkik/android/f/a/l;

    iget v2, v2, Lkik/android/f/a/l;->d:I

    iget-object v3, p0, Lkik/android/f/a/n;->c:Lkik/android/f/a/m;

    iget-object v3, v3, Lkik/android/f/a/m;->b:Lkik/android/f/a/l;

    iget-boolean v3, v3, Lkik/android/f/a/l;->e:Z

    iget-object v4, p0, Lkik/android/f/a/n;->c:Lkik/android/f/a/m;

    iget-object v4, v4, Lkik/android/f/a/m;->b:Lkik/android/f/a/l;

    iget-object v4, v4, Lkik/android/f/a/l;->b:Lkik/a/e/r;

    invoke-static {v0, v1, v2, v3, v4}, Lkik/android/f/a/f;->a(Ljava/lang/String;Landroid/app/Activity;IZLkik/a/e/r;)V

    .line 1392
    return-void
.end method
