.class final Lkik/android/util/bq;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/util/bo;


# direct methods
.method constructor <init>(Lkik/android/util/bo;)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lkik/android/util/bq;->a:Lkik/android/util/bo;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 106
    iget-object v0, p0, Lkik/android/util/bq;->a:Lkik/android/util/bo;

    invoke-static {v0}, Lkik/android/util/bo;->g(Lkik/android/util/bo;)Lkik/android/util/bl;

    move-result-object v0

    const/16 v1, 0x3ff

    invoke-virtual {v0, v1}, Lkik/android/util/bl;->removeMessages(I)V

    return-void
.end method
