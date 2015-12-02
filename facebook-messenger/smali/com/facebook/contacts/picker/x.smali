.class public Lcom/facebook/contacts/picker/x;
.super Ljava/lang/Object;
.source "ContactPickerMergedFilter.java"

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
.field private final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ab;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/facebook/contacts/picker/w;

.field private d:Lcom/facebook/widget/a/h;

.field private e:Lcom/facebook/widget/a/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 101
    const-class v0, Lcom/facebook/contacts/picker/x;

    sput-object v0, Lcom/facebook/contacts/picker/x;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/google/common/a/es;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ac;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    sget-object v0, Lcom/facebook/widget/a/j;->FINISHED:Lcom/facebook/widget/a/j;

    iput-object v0, p0, Lcom/facebook/contacts/picker/x;->e:Lcom/facebook/widget/a/j;

    .line 110
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 111
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ac;

    .line 112
    new-instance v3, Lcom/facebook/contacts/picker/ab;

    invoke-direct {v3, v0}, Lcom/facebook/contacts/picker/ab;-><init>(Lcom/facebook/contacts/picker/ac;)V

    invoke-virtual {v1, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 114
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/x;->b:Lcom/google/common/a/es;

    .line 115
    return-void
.end method

.method private a(Lcom/facebook/contacts/picker/l;Ljava/util/Set;)Lcom/facebook/contacts/picker/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/contacts/picker/l;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/user/UserIdentifierKey;",
            ">;)",
            "Lcom/facebook/contacts/picker/l;"
        }
    .end annotation

    .prologue
    .line 255
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 256
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/l;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ad;

    .line 257
    instance-of v3, v0, Lcom/facebook/contacts/picker/ag;

    if-eqz v3, :cond_1

    .line 258
    check-cast v0, Lcom/facebook/contacts/picker/ag;

    .line 259
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->a()Lcom/facebook/user/UserWithIdentifier;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/user/UserWithIdentifier;->c()Lcom/facebook/user/UserIdentifier;

    move-result-object v3

    .line 260
    invoke-virtual {v3}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 261
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 264
    :cond_1
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 267
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/l;->b()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/contacts/picker/l;->a(Ljava/lang/CharSequence;Lcom/google/common/a/es;)Lcom/facebook/contacts/picker/l;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 18
    sget-object v0, Lcom/facebook/contacts/picker/x;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/contacts/picker/x;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/facebook/contacts/picker/x;->b()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/picker/x;Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/contacts/picker/x;->b(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private a(Lcom/google/common/a/es;Lcom/google/common/a/et;Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;",
            "Lcom/google/common/a/et",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/user/UserIdentifierKey;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 274
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ad;

    .line 275
    instance-of v2, v0, Lcom/facebook/contacts/picker/ag;

    if-eqz v2, :cond_1

    .line 276
    check-cast v0, Lcom/facebook/contacts/picker/ag;

    .line 277
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->a()Lcom/facebook/user/UserWithIdentifier;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/user/UserWithIdentifier;->c()Lcom/facebook/user/UserIdentifier;

    move-result-object v2

    .line 278
    invoke-virtual {v2}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v3

    invoke-interface {p3, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 279
    invoke-virtual {p2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 280
    invoke-virtual {v2}, Lcom/facebook/user/UserIdentifier;->c()Lcom/facebook/user/UserIdentifierKey;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 283
    :cond_1
    invoke-virtual {p2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 286
    :cond_2
    return-void
.end method

.method private b()V
    .locals 5

    .prologue
    .line 172
    sget-object v1, Lcom/facebook/widget/a/j;->FINISHED:Lcom/facebook/widget/a/j;

    .line 173
    iget-object v0, p0, Lcom/facebook/contacts/picker/x;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ab;

    .line 174
    sget-object v3, Lcom/facebook/widget/a/j;->FILTERING:Lcom/facebook/widget/a/j;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ab;->d()Lcom/facebook/widget/a/j;

    move-result-object v0

    if-ne v3, v0, :cond_0

    .line 175
    sget-object v0, Lcom/facebook/widget/a/j;->FILTERING:Lcom/facebook/widget/a/j;

    .line 180
    :goto_0
    iget-object v1, p0, Lcom/facebook/contacts/picker/x;->e:Lcom/facebook/widget/a/j;

    if-eq v0, v1, :cond_1

    .line 181
    iput-object v0, p0, Lcom/facebook/contacts/picker/x;->e:Lcom/facebook/widget/a/j;

    .line 182
    sget-object v1, Lcom/facebook/contacts/picker/x;->a:Ljava/lang/Class;

    const-string v2, "New filtering state: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    iget-object v0, p0, Lcom/facebook/contacts/picker/x;->d:Lcom/facebook/widget/a/h;

    if-eqz v0, :cond_1

    .line 184
    iget-object v0, p0, Lcom/facebook/contacts/picker/x;->d:Lcom/facebook/widget/a/h;

    iget-object v1, p0, Lcom/facebook/contacts/picker/x;->e:Lcom/facebook/widget/a/j;

    invoke-interface {v0, v1}, Lcom/facebook/widget/a/h;->a(Lcom/facebook/widget/a/j;)V

    .line 187
    :cond_1
    return-void

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method private b(Ljava/lang/CharSequence;)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 190
    invoke-direct {p0, p1}, Lcom/facebook/contacts/picker/x;->c(Ljava/lang/CharSequence;)Lcom/facebook/contacts/picker/l;

    move-result-object v1

    .line 191
    if-eqz v1, :cond_0

    .line 192
    sget-object v2, Lcom/facebook/contacts/picker/x;->a:Ljava/lang/Class;

    const-string v3, "New filtering result: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v1, v4, v0

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    iget-object v2, p0, Lcom/facebook/contacts/picker/x;->c:Lcom/facebook/contacts/picker/w;

    invoke-interface {v2, p1, v1}, Lcom/facebook/contacts/picker/w;->a(Ljava/lang/CharSequence;Lcom/facebook/contacts/picker/l;)V

    .line 194
    iget-object v2, p0, Lcom/facebook/contacts/picker/x;->d:Lcom/facebook/widget/a/h;

    if-eqz v2, :cond_0

    .line 196
    sget-object v2, Lcom/facebook/contacts/picker/aa;->a:[I

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/l;->a()Lcom/facebook/contacts/picker/m;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/contacts/picker/m;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 208
    :goto_0
    iget-object v1, p0, Lcom/facebook/contacts/picker/x;->d:Lcom/facebook/widget/a/h;

    invoke-interface {v1, v0}, Lcom/facebook/widget/a/h;->a(I)V

    .line 211
    :cond_0
    return-void

    .line 198
    :pswitch_0
    const/4 v0, -0x1

    .line 199
    goto :goto_0

    .line 201
    :pswitch_1
    invoke-virtual {v1}, Lcom/facebook/contacts/picker/l;->c()I

    move-result v0

    goto :goto_0

    .line 196
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private c(Ljava/lang/CharSequence;)Lcom/facebook/contacts/picker/l;
    .locals 7

    .prologue
    .line 215
    iget-object v0, p0, Lcom/facebook/contacts/picker/x;->b:Lcom/google/common/a/es;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ab;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ab;->c()Lcom/facebook/contacts/picker/l;

    move-result-object v0

    .line 216
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/l;->b()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 218
    :cond_0
    const/4 v0, 0x0

    .line 249
    :cond_1
    :goto_0
    return-object v0

    .line 221
    :cond_2
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/l;->a()Lcom/facebook/contacts/picker/m;

    move-result-object v1

    sget-object v2, Lcom/facebook/contacts/picker/m;->EMPTY_CONSTRAINT:Lcom/facebook/contacts/picker/m;

    if-eq v1, v2, :cond_1

    .line 223
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/l;->a()Lcom/facebook/contacts/picker/m;

    move-result-object v1

    sget-object v2, Lcom/facebook/contacts/picker/m;->EXCEPTION:Lcom/facebook/contacts/picker/m;

    if-eq v1, v2, :cond_1

    .line 227
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v2

    .line 228
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 230
    iget-object v0, p0, Lcom/facebook/contacts/picker/x;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ab;

    .line 231
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ab;->c()Lcom/facebook/contacts/picker/l;

    move-result-object v1

    .line 233
    if-eqz v1, :cond_3

    .line 234
    invoke-virtual {v1}, Lcom/facebook/contacts/picker/l;->a()Lcom/facebook/contacts/picker/m;

    move-result-object v5

    sget-object v6, Lcom/facebook/contacts/picker/m;->OK:Lcom/facebook/contacts/picker/m;

    if-ne v5, v6, :cond_4

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/l;->b()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-static {p1, v5}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 236
    invoke-direct {p0, v1, v2}, Lcom/facebook/contacts/picker/x;->a(Lcom/facebook/contacts/picker/l;Ljava/util/Set;)Lcom/facebook/contacts/picker/l;

    move-result-object v1

    .line 237
    invoke-virtual {v0, v1}, Lcom/facebook/contacts/picker/ab;->a(Lcom/facebook/contacts/picker/l;)V

    .line 240
    :cond_4
    invoke-virtual {v1}, Lcom/facebook/contacts/picker/l;->c()I

    move-result v5

    if-lez v5, :cond_3

    .line 241
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ab;->b()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 242
    new-instance v5, Lcom/facebook/contacts/picker/ae;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ab;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/facebook/contacts/picker/ae;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 245
    :cond_5
    invoke-virtual {v1}, Lcom/facebook/contacts/picker/l;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0, v3, v2}, Lcom/facebook/contacts/picker/x;->a(Lcom/google/common/a/es;Lcom/google/common/a/et;Ljava/util/Set;)V

    goto :goto_1

    .line 249
    :cond_6
    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/facebook/contacts/picker/l;->a(Ljava/lang/CharSequence;Lcom/google/common/a/es;)Lcom/facebook/contacts/picker/l;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/picker/v;)V
    .locals 2

    .prologue
    .line 142
    iget-object v0, p0, Lcom/facebook/contacts/picker/x;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ab;

    .line 143
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ab;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/contacts/picker/u;->a(Lcom/facebook/contacts/picker/v;)V

    goto :goto_0

    .line 145
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/contacts/picker/w;)V
    .locals 4

    .prologue
    .line 119
    iput-object p1, p0, Lcom/facebook/contacts/picker/x;->c:Lcom/facebook/contacts/picker/w;

    .line 120
    iget-object v0, p0, Lcom/facebook/contacts/picker/x;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ab;

    .line 121
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ab;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v2

    new-instance v3, Lcom/facebook/contacts/picker/y;

    invoke-direct {v3, p0, v0}, Lcom/facebook/contacts/picker/y;-><init>(Lcom/facebook/contacts/picker/x;Lcom/facebook/contacts/picker/ab;)V

    invoke-interface {v2, v3}, Lcom/facebook/contacts/picker/u;->a(Lcom/facebook/contacts/picker/w;)V

    goto :goto_0

    .line 131
    :cond_0
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
    .line 135
    iget-object v0, p0, Lcom/facebook/contacts/picker/x;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ab;

    .line 136
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ab;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/contacts/picker/u;->a(Lcom/google/common/a/es;)V

    goto :goto_0

    .line 138
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 149
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/contacts/picker/x;->a(Ljava/lang/CharSequence;Lcom/facebook/widget/a/h;)V

    .line 150
    return-void
.end method

.method public a(Ljava/lang/CharSequence;Lcom/facebook/widget/a/h;)V
    .locals 4

    .prologue
    .line 154
    iput-object p2, p0, Lcom/facebook/contacts/picker/x;->d:Lcom/facebook/widget/a/h;

    .line 155
    iget-object v0, p0, Lcom/facebook/contacts/picker/x;->b:Lcom/google/common/a/es;

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ab;

    .line 156
    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ab;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v2

    new-instance v3, Lcom/facebook/contacts/picker/z;

    invoke-direct {v3, p0, v0}, Lcom/facebook/contacts/picker/z;-><init>(Lcom/facebook/contacts/picker/x;Lcom/facebook/contacts/picker/ab;)V

    invoke-interface {v2, p1, v3}, Lcom/facebook/contacts/picker/u;->a(Ljava/lang/CharSequence;Lcom/facebook/widget/a/h;)V

    goto :goto_0

    .line 169
    :cond_0
    return-void
.end method
