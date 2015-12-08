.class final Lkik/android/chat/activity/KikActivityBase$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/activity/KikActivityBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/chat/activity/KikActivityBase;

.field private b:Lcom/kik/g/f;

.field private c:Lcom/kik/g/i;


# direct methods
.method public constructor <init>(Lkik/android/chat/activity/KikActivityBase;)V
    .locals 3

    .prologue
    .line 177
    iput-object p1, p0, Lkik/android/chat/activity/KikActivityBase$a;->a:Lkik/android/chat/activity/KikActivityBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    new-instance v0, Lkik/android/chat/activity/m;

    invoke-direct {v0, p0}, Lkik/android/chat/activity/m;-><init>(Lkik/android/chat/activity/KikActivityBase$a;)V

    iput-object v0, p0, Lkik/android/chat/activity/KikActivityBase$a;->c:Lcom/kik/g/i;

    .line 178
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/activity/KikActivityBase$a;->b:Lcom/kik/g/f;

    .line 179
    iget-object v0, p0, Lkik/android/chat/activity/KikActivityBase$a;->b:Lcom/kik/g/f;

    iget-object v1, p1, Lkik/android/chat/activity/KikActivityBase;->c:Lkik/a/ab;

    invoke-interface {v1}, Lkik/a/ab;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/activity/KikActivityBase$a;->c:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 180
    iget-object v0, p0, Lkik/android/chat/activity/KikActivityBase$a;->b:Lcom/kik/g/f;

    iget-object v1, p1, Lkik/android/chat/activity/KikActivityBase;->c:Lkik/a/ab;

    invoke-interface {v1}, Lkik/a/ab;->c()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/activity/KikActivityBase$a;->c:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 181
    return-void
.end method

.method static synthetic a(Lkik/android/chat/activity/KikActivityBase$a;)Lcom/kik/g/f;
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lkik/android/chat/activity/KikActivityBase$a;->b:Lcom/kik/g/f;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 185
    iget-object v0, p0, Lkik/android/chat/activity/KikActivityBase$a;->b:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 186
    return-void
.end method
