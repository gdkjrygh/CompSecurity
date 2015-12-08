.class final Lkik/android/d/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/d/i;


# direct methods
.method constructor <init>(Lkik/android/d/i;)V
    .locals 0

    .prologue
    .line 245
    iput-object p1, p0, Lkik/android/d/j;->a:Lkik/android/d/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 249
    const-string v0, "Crashed from La Forge. Testing crashlytics logs."

    invoke-static {v0}, Lcom/a/a/a;->a(Ljava/lang/String;)V

    .line 250
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Avada Kedavra"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
