.class final Lcom/kik/android/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/android/a;


# direct methods
.method constructor <init>(Lcom/kik/android/a;)V
    .locals 0

    .prologue
    .line 1899
    iput-object p1, p0, Lcom/kik/android/e;->a:Lcom/kik/android/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 1902
    iget-object v0, p0, Lcom/kik/android/e;->a:Lcom/kik/android/a;

    invoke-static {v0}, Lcom/kik/android/a;->l(Lcom/kik/android/a;)V

    .line 1903
    return-void
.end method
