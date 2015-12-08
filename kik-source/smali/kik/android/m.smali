.class final Lkik/android/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/d/c;

.field final synthetic b:Lkik/android/a;

.field final synthetic c:Lkik/android/j;


# direct methods
.method constructor <init>(Lkik/android/j;Lkik/android/d/c;Lkik/android/a;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Lkik/android/m;->c:Lkik/android/j;

    iput-object p2, p0, Lkik/android/m;->a:Lkik/android/d/c;

    iput-object p3, p0, Lkik/android/m;->b:Lkik/android/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 158
    iget-object v0, p0, Lkik/android/m;->a:Lkik/android/d/c;

    const-string v1, "matching-opt-in"

    invoke-interface {v0, v1}, Lkik/android/d/c;->a(Ljava/lang/String;)Lkik/android/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/d/b;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 159
    if-eqz v0, :cond_0

    .line 160
    iget-object v0, p0, Lkik/android/m;->b:Lkik/android/a;

    invoke-virtual {v0}, Lkik/android/a;->d()V

    .line 165
    :goto_0
    return-void

    .line 163
    :cond_0
    iget-object v0, p0, Lkik/android/m;->b:Lkik/android/a;

    invoke-virtual {v0}, Lkik/android/a;->e()V

    goto :goto_0
.end method
