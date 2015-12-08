.class final Lcom/kik/android/f;
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
    .line 2059
    iput-object p1, p0, Lcom/kik/android/f;->a:Lcom/kik/android/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 2062
    iget-object v0, p0, Lcom/kik/android/f;->a:Lcom/kik/android/a;

    invoke-static {v0}, Lcom/kik/android/a;->m(Lcom/kik/android/a;)V

    .line 2063
    return-void
.end method
