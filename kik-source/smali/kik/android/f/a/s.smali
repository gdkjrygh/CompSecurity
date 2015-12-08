.class final Lkik/android/f/a/s;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/p;

.field final synthetic b:Lkik/android/f/a/f;


# direct methods
.method constructor <init>(Lkik/android/f/a/f;Lcom/kik/g/p;)V
    .locals 0

    .prologue
    .line 876
    iput-object p1, p0, Lkik/android/f/a/s;->b:Lkik/android/f/a/f;

    iput-object p2, p0, Lkik/android/f/a/s;->a:Lcom/kik/g/p;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 880
    iget-object v0, p0, Lkik/android/f/a/s;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 881
    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 892
    iget-object v0, p0, Lkik/android/f/a/s;->a:Lcom/kik/g/p;

    invoke-virtual {v0, p1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 893
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 886
    iget-object v0, p0, Lkik/android/f/a/s;->a:Lcom/kik/g/p;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 887
    return-void
.end method
