.class final Lcom/kik/android/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/g/ar;

.field final synthetic b:Lcom/kik/android/b/a;


# direct methods
.method constructor <init>(Lcom/kik/android/b/a;Lcom/kik/g/ar;)V
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/kik/android/b/b;->b:Lcom/kik/android/b/a;

    iput-object p2, p0, Lcom/kik/android/b/b;->a:Lcom/kik/g/ar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/kik/android/b/b;->a:Lcom/kik/g/ar;

    invoke-virtual {v0}, Lcom/kik/g/ar;->c()V

    .line 94
    return-void
.end method
