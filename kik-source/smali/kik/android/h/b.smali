.class final Lkik/android/h/b;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/h/a;


# direct methods
.method constructor <init>(Lkik/android/h/a;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lkik/android/h/b;->a:Lkik/android/h/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 69
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    .line 70
    iget-object v0, p0, Lkik/android/h/b;->a:Lkik/android/h/a;

    iget-object v0, v0, Lkik/android/h/a;->a:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 71
    return-void
.end method
