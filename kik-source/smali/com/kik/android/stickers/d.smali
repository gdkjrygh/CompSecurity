.class final Lcom/kik/android/stickers/d;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/android/stickers/c;


# direct methods
.method constructor <init>(Lcom/kik/android/stickers/c;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/kik/android/stickers/d;->a:Lcom/kik/android/stickers/c;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 41
    check-cast p2, Ljava/lang/Boolean;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/android/stickers/d;->a:Lcom/kik/android/stickers/c;

    invoke-virtual {v0}, Lcom/kik/android/stickers/c;->b()Lcom/kik/g/p;

    :cond_0
    return-void
.end method
