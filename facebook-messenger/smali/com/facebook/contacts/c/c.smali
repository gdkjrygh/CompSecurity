.class public Lcom/facebook/contacts/c/c;
.super Ljava/lang/Object;
.source "GraphQLContactNodeSummaryAttributeAppender.java"

# interfaces
.implements Lcom/facebook/contacts/c/b;


# instance fields
.field private final a:Lcom/facebook/contacts/f/a;


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/f/a;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/facebook/contacts/c/c;->a:Lcom/facebook/contacts/f/a;

    .line 19
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/g/a/b;)V
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 23
    const-string v0, "parts"

    invoke-static {v0}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v1, "offset"

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v1, "length"

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v1, "part"

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    .line 30
    const-string v1, "id"

    invoke-virtual {p1, v1}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "graph_api_write_id"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "represented_profile"

    invoke-static {v2}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "id"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "birthday"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "rank"

    invoke-static {v3}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v3

    const-string v4, "coeff_rank"

    new-array v5, v8, [Ljava/lang/Object;

    const-string v6, "communication"

    aput-object v6, v5, v7

    invoke-virtual {v3, v4, v5}, Lcom/facebook/g/a/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/facebook/g/a/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "can_message"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "is_mobile_pushable"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "is_memorialized"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "timeline_cover_photo"

    invoke-static {v3}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v3

    const-string v4, "focus"

    invoke-static {v4}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v4

    const-string v5, "x"

    invoke-virtual {v4, v5}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v4

    const-string v5, "y"

    invoke-virtual {v4, v5}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v3

    const-string v4, "photo"

    invoke-static {v4}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v4

    const-string v5, "image.size(180) as image_lowres{uri,width,height}"

    invoke-virtual {v4, v5}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "name_search_tokens"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "__type__"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "structured_name"

    invoke-static {v2}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "text"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "phonetic_name"

    invoke-static {v2}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v2, "text"

    invoke-virtual {v0, v2}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v1, "phones"

    invoke-static {v1}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "is_verified"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "primary_field"

    invoke-static {v2}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "id"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "label"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "phone"

    invoke-static {v3}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v3

    const-string v4, "display_number"

    invoke-virtual {v3, v4}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v3

    const-string v4, "universal_number"

    invoke-virtual {v3, v4}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v1, "emails"

    invoke-static {v1}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "primary_field"

    invoke-static {v2}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "id"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "label"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    const-string v3, "value"

    invoke-virtual {v2, v3}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v1, "profile_picture"

    invoke-static {v1}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "size"

    new-array v3, v8, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/facebook/contacts/c/c;->a:Lcom/facebook/contacts/f/a;

    sget-object v5, Lcom/facebook/contacts/f/b;->SMALL:Lcom/facebook/contacts/f/b;

    invoke-virtual {v4, v5}, Lcom/facebook/contacts/f/a;->a(Lcom/facebook/contacts/f/b;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-virtual {v1, v2, v3}, Lcom/facebook/g/a/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "uri"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "small_picture_url"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->d(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v1, "profile_picture"

    invoke-static {v1}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "size"

    new-array v3, v8, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/facebook/contacts/c/c;->a:Lcom/facebook/contacts/f/a;

    sget-object v5, Lcom/facebook/contacts/f/b;->BIG:Lcom/facebook/contacts/f/b;

    invoke-virtual {v4, v5}, Lcom/facebook/contacts/f/a;->a(Lcom/facebook/contacts/f/b;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-virtual {v1, v2, v3}, Lcom/facebook/g/a/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "uri"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "big_picture_url"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->d(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    move-result-object v0

    const-string v1, "profile_picture"

    invoke-static {v1}, Lcom/facebook/g/a/a;->b(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "size"

    new-array v3, v8, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/facebook/contacts/c/c;->a:Lcom/facebook/contacts/f/a;

    sget-object v5, Lcom/facebook/contacts/f/b;->HUGE:Lcom/facebook/contacts/f/b;

    invoke-virtual {v4, v5}, Lcom/facebook/contacts/f/a;->a(Lcom/facebook/contacts/f/b;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-virtual {v1, v2, v3}, Lcom/facebook/g/a/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "uri"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->c(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    const-string v2, "huge_picture_url"

    invoke-virtual {v1, v2}, Lcom/facebook/g/a/b;->d(Ljava/lang/String;)Lcom/facebook/g/a/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/g/a/b;->f()Lcom/facebook/g/a/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/g/a/b;->a(Lcom/facebook/g/a/a;)Lcom/facebook/g/a/b;

    .line 118
    return-void
.end method
