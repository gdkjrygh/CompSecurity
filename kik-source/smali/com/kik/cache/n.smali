.class final Lcom/kik/cache/n;
.super Lcom/kik/cache/SimpleLruBitmapCache$a;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lcom/kik/cache/n;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/cache/SimpleLruBitmapCache$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 130
    if-nez p1, :cond_1

    .line 136
    :cond_0
    :goto_0
    return v0

    .line 133
    :cond_1
    iget-object v1, p0, Lcom/kik/cache/n;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 134
    const/4 v0, 0x1

    goto :goto_0
.end method
