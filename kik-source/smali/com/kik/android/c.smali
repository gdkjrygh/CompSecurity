.class final Lcom/kik/android/c;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/android/a;


# direct methods
.method constructor <init>(Lcom/kik/android/a;)V
    .locals 0

    .prologue
    .line 1187
    iput-object p1, p0, Lcom/kik/android/c;->a:Lcom/kik/android/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 1187
    check-cast p1, Lcom/kik/n/a/h/a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/kik/n/a/h/a;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/kik/android/c;->a:Lcom/kik/android/a;

    invoke-static {v1, v0}, Lcom/kik/android/a;->a(Lcom/kik/android/a;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kik/android/c;->a:Lcom/kik/android/a;

    invoke-virtual {p1}, Lcom/kik/n/a/h/a;->c()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-static {v1, v2}, Lcom/kik/android/a;->a(Lcom/kik/android/a;Z)V

    iget-object v1, p0, Lcom/kik/android/c;->a:Lcom/kik/android/a;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/kik/android/a;->a(Ljava/lang/String;Z)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/kik/android/c;->a:Lcom/kik/android/a;

    invoke-static {v0}, Lcom/kik/android/a;->j(Lcom/kik/android/a;)V

    goto :goto_0
.end method
