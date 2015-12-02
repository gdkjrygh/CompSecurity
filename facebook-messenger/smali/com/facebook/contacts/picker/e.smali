.class public Lcom/facebook/contacts/picker/e;
.super Ljava/lang/Object;
.source "ContactPickerCascadingFilter.java"

# interfaces
.implements Lcom/facebook/contacts/picker/u;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/contacts/picker/j;

.field private final c:Lcom/facebook/contacts/picker/j;

.field private final d:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/j;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/facebook/contacts/picker/w;

.field private f:Lcom/facebook/widget/a/h;

.field private g:Lcom/facebook/widget/a/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    const-class v0, Lcom/facebook/contacts/picker/e;

    sput-object v0, Lcom/facebook/contacts/picker/e;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/contacts/picker/u;Lcom/facebook/contacts/picker/u;)V
    .locals 2

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    sget-object v0, Lcom/facebook/widget/a/j;->FINISHED:Lcom/facebook/widget/a/j;

    iput-object v0, p0, Lcom/facebook/contacts/picker/e;->g:Lcom/facebook/widget/a/j;

    .line 68
    new-instance v0, Lcom/facebook/contacts/picker/j;

    invoke-direct {v0, p1}, Lcom/facebook/contacts/picker/j;-><init>(Lcom/facebook/contacts/picker/u;)V

    iput-object v0, p0, Lcom/facebook/contacts/picker/e;->b:Lcom/facebook/contacts/picker/j;

    .line 69
    new-instance v0, Lcom/facebook/contacts/picker/j;

    invoke-direct {v0, p2}, Lcom/facebook/contacts/picker/j;-><init>(Lcom/facebook/contacts/picker/u;)V

    iput-object v0, p0, Lcom/facebook/contacts/picker/e;->c:Lcom/facebook/contacts/picker/j;

    .line 70
    iget-object v0, p0, Lcom/facebook/contacts/picker/e;->b:Lcom/facebook/contacts/picker/j;

    iget-object v1, p0, Lcom/facebook/contacts/picker/e;->c:Lcom/facebook/contacts/picker/j;

    invoke-static {v0, v1}, Lcom/google/common/a/es;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/e;->d:Lcom/google/common/a/es;

    .line 72
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/picker/e;)Lcom/facebook/contacts/picker/j;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/contacts/picker/e;->c:Lcom/facebook/contacts/picker/j;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 18
    sget-object v0, Lcom/facebook/contacts/picker/e;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/contacts/picker/e;Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/contacts/picker/e;->b(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static a(Lcom/facebook/contacts/picker/l;Ljava/lang/CharSequence;)Z
    .locals 1
    .param p0    # Lcom/facebook/contacts/picker/l;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 214
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/contacts/picker/l;->b()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/contacts/picker/e;)Lcom/facebook/contacts/picker/j;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/contacts/picker/e;->b:Lcom/facebook/contacts/picker/j;

    return-object v0
.end method

.method private b()V
    .locals 5

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/contacts/picker/e;->c:Lcom/facebook/contacts/picker/j;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/j;->c()Lcom/facebook/widget/a/j;

    move-result-object v0

    .line 143
    iget-object v1, p0, Lcom/facebook/contacts/picker/e;->g:Lcom/facebook/widget/a/j;

    if-eq v0, v1, :cond_0

    .line 144
    iput-object v0, p0, Lcom/facebook/contacts/picker/e;->g:Lcom/facebook/widget/a/j;

    .line 145
    sget-object v1, Lcom/facebook/contacts/picker/e;->a:Ljava/lang/Class;

    const-string v2, "New filtering state: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lcom/facebook/contacts/picker/e;->f:Lcom/facebook/widget/a/h;

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/facebook/contacts/picker/e;->f:Lcom/facebook/widget/a/h;

    iget-object v1, p0, Lcom/facebook/contacts/picker/e;->g:Lcom/facebook/widget/a/j;

    invoke-interface {v0, v1}, Lcom/facebook/widget/a/h;->a(Lcom/facebook/widget/a/j;)V

    .line 150
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/CharSequence;)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 153
    invoke-direct {p0, p1}, Lcom/facebook/contacts/picker/e;->c(Ljava/lang/CharSequence;)Lcom/facebook/contacts/picker/l;

    move-result-object v1

    .line 154
    if-eqz v1, :cond_0

    .line 155
    sget-object v2, Lcom/facebook/contacts/picker/e;->a:Ljava/lang/Class;

    const-string v3, "New filtering result: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v1, v4, v0

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    iget-object v2, p0, Lcom/facebook/contacts/picker/e;->e:Lcom/facebook/contacts/picker/w;

    invoke-interface {v2, p1, v1}, Lcom/facebook/contacts/picker/w;->a(Ljava/lang/CharSequence;Lcom/facebook/contacts/picker/l;)V

    .line 157
    iget-object v2, p0, Lcom/facebook/contacts/picker/e;->f:Lcom/facebook/widget/a/h;

    if-eqz v2, :cond_0

    .line 159
    sget-object v2, Lcom/facebook/contacts/picker/i;->a:[I

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/l;->a()Lcom/facebook/contacts/picker/m;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/contacts/picker/m;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 171
    :goto_0
    iget-object v1, p0, Lcom/facebook/contacts/picker/e;->f:Lcom/facebook/widget/a/h;

    invoke-interface {v1, v0}, Lcom/facebook/widget/a/h;->a(I)V

    .line 174
    :cond_0
    return-void

    .line 161
    :pswitch_0
    const/4 v0, -0x1

    .line 162
    goto :goto_0

    .line 164
    :pswitch_1
    invoke-virtual {v1}, Lcom/facebook/contacts/picker/l;->c()I

    move-result v0

    goto :goto_0

    .line 159
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private c(Ljava/lang/CharSequence;)Lcom/facebook/contacts/picker/l;
    .locals 6

    .prologue
    .line 177
    invoke-static {p1}, Lcom/facebook/common/w/n;->c(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    invoke-static {p1}, Lcom/facebook/contacts/picker/l;->a(Ljava/lang/CharSequence;)Lcom/facebook/contacts/picker/l;

    move-result-object v0

    .line 208
    :goto_0
    return-object v0

    .line 180
    :cond_0
    sget-object v0, Lcom/facebook/contacts/picker/e;->a:Ljava/lang/Class;

    const-string v1, "preforming filtering for: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    iget-object v0, p0, Lcom/facebook/contacts/picker/e;->b:Lcom/facebook/contacts/picker/j;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/j;->b()Lcom/facebook/contacts/picker/l;

    move-result-object v1

    .line 183
    iget-object v0, p0, Lcom/facebook/contacts/picker/e;->c:Lcom/facebook/contacts/picker/j;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/j;->b()Lcom/facebook/contacts/picker/l;

    move-result-object v0

    .line 185
    invoke-static {v1, p1}, Lcom/facebook/contacts/picker/e;->a(Lcom/facebook/contacts/picker/l;Ljava/lang/CharSequence;)Z

    move-result v2

    .line 186
    invoke-static {v0, p1}, Lcom/facebook/contacts/picker/e;->a(Lcom/facebook/contacts/picker/l;Ljava/lang/CharSequence;)Z

    move-result v3

    .line 188
    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/l;->a()Lcom/facebook/contacts/picker/m;

    move-result-object v4

    sget-object v5, Lcom/facebook/contacts/picker/m;->OK:Lcom/facebook/contacts/picker/m;

    if-ne v4, v5, :cond_1

    .line 189
    sget-object v1, Lcom/facebook/contacts/picker/e;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "slow valid: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/l;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 193
    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/l;->a()Lcom/facebook/contacts/picker/m;

    move-result-object v4

    sget-object v5, Lcom/facebook/contacts/picker/m;->OK:Lcom/facebook/contacts/picker/m;

    if-ne v4, v5, :cond_2

    .line 194
    sget-object v0, Lcom/facebook/contacts/picker/e;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "quick valid: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/l;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v1

    .line 195
    goto :goto_0

    .line 198
    :cond_2
    if-eqz v3, :cond_3

    .line 199
    sget-object v1, Lcom/facebook/contacts/picker/e;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "slow valid but failed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/l;->a()Lcom/facebook/contacts/picker/m;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 203
    :cond_3
    if-eqz v2, :cond_4

    .line 204
    sget-object v0, Lcom/facebook/contacts/picker/e;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "quick valid but failed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/l;->a()Lcom/facebook/contacts/picker/m;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v1

    .line 205
    goto/16 :goto_0

    .line 207
    :cond_4
    sget-object v0, Lcom/facebook/contacts/picker/e;->a:Ljava/lang/Class;

    const-string v1, "both invalid"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 208
    const/4 v0, 0x0

    goto/16 :goto_0
.end method

.method static synthetic c(Lcom/facebook/contacts/picker/e;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/facebook/contacts/picker/e;->b()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/picker/v;)V
    .locals 2

    .prologue
    .line 105
    iget-object v0, p0, Lcom/facebook/contacts/picker/e;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/j;

    .line 106
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/j;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/contacts/picker/u;->a(Lcom/facebook/contacts/picker/v;)V

    goto :goto_0

    .line 108
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/contacts/picker/w;)V
    .locals 2

    .prologue
    .line 76
    sget-object v0, Lcom/facebook/contacts/picker/e;->a:Ljava/lang/Class;

    const-string v1, "init"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 77
    iput-object p1, p0, Lcom/facebook/contacts/picker/e;->e:Lcom/facebook/contacts/picker/w;

    .line 78
    iget-object v0, p0, Lcom/facebook/contacts/picker/e;->c:Lcom/facebook/contacts/picker/j;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/j;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/picker/f;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/picker/f;-><init>(Lcom/facebook/contacts/picker/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/contacts/picker/u;->a(Lcom/facebook/contacts/picker/w;)V

    .line 85
    iget-object v0, p0, Lcom/facebook/contacts/picker/e;->b:Lcom/facebook/contacts/picker/j;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/j;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    new-instance v1, Lcom/facebook/contacts/picker/g;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/picker/g;-><init>(Lcom/facebook/contacts/picker/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/contacts/picker/u;->a(Lcom/facebook/contacts/picker/w;)V

    .line 94
    return-void
.end method

.method public a(Lcom/google/common/a/es;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserIdentifierKey;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/contacts/picker/e;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/j;

    .line 99
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/j;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/contacts/picker/u;->a(Lcom/google/common/a/es;)V

    goto :goto_0

    .line 101
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 112
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/contacts/picker/e;->a(Ljava/lang/CharSequence;Lcom/facebook/widget/a/h;)V

    .line 113
    return-void
.end method

.method public a(Ljava/lang/CharSequence;Lcom/facebook/widget/a/h;)V
    .locals 4

    .prologue
    .line 117
    sget-object v0, Lcom/facebook/contacts/picker/e;->a:Ljava/lang/Class;

    const-string v1, "Starting filtering"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 118
    iput-object p2, p0, Lcom/facebook/contacts/picker/e;->f:Lcom/facebook/widget/a/h;

    .line 119
    iget-object v0, p0, Lcom/facebook/contacts/picker/e;->d:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/j;

    .line 120
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/j;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v2

    new-instance v3, Lcom/facebook/contacts/picker/h;

    invoke-direct {v3, p0, v0}, Lcom/facebook/contacts/picker/h;-><init>(Lcom/facebook/contacts/picker/e;Lcom/facebook/contacts/picker/j;)V

    invoke-interface {v2, p1, v3}, Lcom/facebook/contacts/picker/u;->a(Ljava/lang/CharSequence;Lcom/facebook/widget/a/h;)V

    goto :goto_0

    .line 137
    :cond_0
    return-void
.end method
