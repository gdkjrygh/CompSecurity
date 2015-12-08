.class public final Lkik/android/gifs/a/g;
.super Lkik/android/gifs/a/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/gifs/a/g$1;
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;

.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://api.riffsy.com/v1/%s?key=FJETZPXGPKBE"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "search"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&tag=%s&limit=%d&pos=%s&&safesearch=%s&locale=%s&type=silent"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkik/android/gifs/a/g;->b:Ljava/lang/String;

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://api.riffsy.com/v1/%s?key=FJETZPXGPKBE"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "tags"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&type=explore&preview=true"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkik/android/gifs/a/g;->c:Ljava/lang/String;

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://api.riffsy.com/v1/%s?key=FJETZPXGPKBE"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "tags"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&type=emoji&locale=%s"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkik/android/gifs/a/g;->d:Ljava/lang/String;

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://api.riffsy.com/v1/%s?key=FJETZPXGPKBE"

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "suggestpreview"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&tag=%s&locale=%s&limit=%s&type=silent"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkik/android/gifs/a/g;->e:Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1}, Lkik/android/gifs/a/b;-><init>(Landroid/content/Context;)V

    .line 35
    return-void
.end method

.method private a(Lcom/kik/g/p;)Lcom/android/volley/r$a;
    .locals 1

    .prologue
    .line 97
    new-instance v0, Lkik/android/gifs/a/j;

    invoke-direct {v0, p0, p1}, Lkik/android/gifs/a/j;-><init>(Lkik/android/gifs/a/g;Lcom/kik/g/p;)V

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/kik/g/p;
    .locals 6

    .prologue
    .line 77
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 78
    new-instance v1, Lcom/android/volley/toolbox/o;

    const-string v2, "https://api.riffsy.com/v1/trending?type=silent"

    new-instance v3, Lkik/android/gifs/a/i;

    invoke-direct {v3, p0, v0}, Lkik/android/gifs/a/i;-><init>(Lkik/android/gifs/a/g;Lcom/kik/g/p;)V

    invoke-direct {p0, v0}, Lkik/android/gifs/a/g;->a(Lcom/kik/g/p;)Lcom/android/volley/r$a;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/android/volley/toolbox/o;-><init>(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;B)V

    .line 90
    const-string v2, "GIF_TRENDING_KEY"

    invoke-virtual {v1, v2}, Lcom/android/volley/toolbox/o;->a(Ljava/lang/Object;)V

    .line 91
    iget-object v2, p0, Lkik/android/gifs/a/g;->a:Lcom/android/volley/p;

    invoke-virtual {v2, v1}, Lcom/android/volley/p;->a(Lcom/android/volley/n;)Lcom/android/volley/n;

    .line 92
    return-object v0
.end method

.method public final a(Ljava/lang/String;ILjava/util/Locale;)Lcom/kik/g/p;
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 47
    new-instance v1, Lcom/kik/g/p;

    invoke-direct {v1}, Lcom/kik/g/p;-><init>()V

    .line 49
    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 50
    sget-object v3, Lkik/android/gifs/a/g;->b:Ljava/lang/String;

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v2, v4, v6

    const/4 v2, 0x1

    const/16 v5, 0x32

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    const/4 v2, 0x2

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v0, "0"

    :cond_0
    aput-object v0, v4, v2

    const/4 v2, 0x3

    sget-object v0, Lkik/android/gifs/a/g$1;->a:[I

    add-int/lit8 v5, p2, -0x1

    aget v0, v0, v5

    packed-switch v0, :pswitch_data_0

    const-string v0, "strict"

    :goto_0
    aput-object v0, v4, v2

    const/4 v0, 0x4

    aput-object p3, v4, v0

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 57
    new-instance v2, Lcom/android/volley/toolbox/o;

    new-instance v3, Lkik/android/gifs/a/h;

    invoke-direct {v3, p0, v1}, Lkik/android/gifs/a/h;-><init>(Lkik/android/gifs/a/g;Lcom/kik/g/p;)V

    invoke-direct {p0, v1}, Lkik/android/gifs/a/g;->a(Lcom/kik/g/p;)Lcom/android/volley/r$a;

    move-result-object v4

    invoke-direct {v2, v0, v3, v4, v6}, Lcom/android/volley/toolbox/o;-><init>(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;B)V

    .line 69
    const-string v0, "GIF_RESULT_KEY"

    invoke-virtual {v2, v0}, Lcom/android/volley/toolbox/o;->a(Ljava/lang/Object;)V

    .line 70
    iget-object v0, p0, Lkik/android/gifs/a/g;->a:Lcom/android/volley/p;

    invoke-virtual {v0, v2}, Lcom/android/volley/p;->a(Lcom/android/volley/n;)Lcom/android/volley/n;

    .line 71
    return-object v1

    .line 50
    :pswitch_0
    const-string v0, "moderate"

    goto :goto_0

    :pswitch_1
    const-string v0, "off"

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Ljava/util/Locale;)Lcom/kik/g/p;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 130
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 131
    sget-object v1, Lkik/android/gifs/a/g;->d:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v5

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 132
    new-instance v2, Lcom/android/volley/toolbox/o;

    new-instance v3, Lkik/android/gifs/a/k;

    invoke-direct {v3, p0, v0}, Lkik/android/gifs/a/k;-><init>(Lkik/android/gifs/a/g;Lcom/kik/g/p;)V

    invoke-direct {p0, v0}, Lkik/android/gifs/a/g;->a(Lcom/kik/g/p;)Lcom/android/volley/r$a;

    move-result-object v4

    invoke-direct {v2, v1, v3, v4, v5}, Lcom/android/volley/toolbox/o;-><init>(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;B)V

    .line 144
    const-string v1, "GIF_EMOJI_KEY"

    invoke-virtual {v2, v1}, Lcom/android/volley/toolbox/o;->a(Ljava/lang/Object;)V

    .line 145
    iget-object v1, p0, Lkik/android/gifs/a/g;->a:Lcom/android/volley/p;

    invoke-virtual {v1, v2}, Lcom/android/volley/p;->a(Lcom/android/volley/n;)Lcom/android/volley/n;

    .line 146
    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 152
    const-string v0, "http://api.riffsy.com/v1/registershare?key=FJETZPXGPKBE&id=%s&tag=%s&index=%s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v4

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const/4 v2, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 153
    new-instance v1, Lcom/android/volley/toolbox/o;

    new-instance v2, Lkik/android/gifs/a/l;

    invoke-direct {v2, p0}, Lkik/android/gifs/a/l;-><init>(Lkik/android/gifs/a/g;)V

    new-instance v3, Lkik/android/gifs/a/m;

    invoke-direct {v3, p0}, Lkik/android/gifs/a/m;-><init>(Lkik/android/gifs/a/g;)V

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/android/volley/toolbox/o;-><init>(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;B)V

    .line 166
    iget-object v0, p0, Lkik/android/gifs/a/g;->a:Lcom/android/volley/p;

    invoke-virtual {v0, v1}, Lcom/android/volley/p;->a(Lcom/android/volley/n;)Lcom/android/volley/n;

    .line 167
    return-void
.end method
