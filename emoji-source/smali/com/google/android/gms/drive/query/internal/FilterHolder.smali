.class public Lcom/google/android/gms/drive/query/internal/FilterHolder;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/drive/query/internal/FilterHolder;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final KP:Lcom/google/android/gms/drive/query/internal/ComparisonFilter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/query/internal/ComparisonFilter",
            "<*>;"
        }
    .end annotation
.end field

.field final KQ:Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;

.field final KR:Lcom/google/android/gms/drive/query/internal/LogicalFilter;

.field final KS:Lcom/google/android/gms/drive/query/internal/NotFilter;

.field final KT:Lcom/google/android/gms/drive/query/internal/InFilter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/query/internal/InFilter",
            "<*>;"
        }
    .end annotation
.end field

.field final KU:Lcom/google/android/gms/drive/query/internal/MatchAllFilter;

.field final KV:Lcom/google/android/gms/drive/query/internal/HasFilter;

.field private final KW:Lcom/google/android/gms/drive/query/Filter;

.field final xM:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/query/internal/d;

    invoke-direct {v0}, Lcom/google/android/gms/drive/query/internal/d;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/query/internal/ComparisonFilter;Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;Lcom/google/android/gms/drive/query/internal/LogicalFilter;Lcom/google/android/gms/drive/query/internal/NotFilter;Lcom/google/android/gms/drive/query/internal/InFilter;Lcom/google/android/gms/drive/query/internal/MatchAllFilter;Lcom/google/android/gms/drive/query/internal/HasFilter;)V
    .locals 2
    .param p1, "versionCode"    # I
    .param p3, "fieldOnlyFilter"    # Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;
    .param p4, "logicalFilter"    # Lcom/google/android/gms/drive/query/internal/LogicalFilter;
    .param p5, "notFilter"    # Lcom/google/android/gms/drive/query/internal/NotFilter;
    .param p7, "matchAllFilter"    # Lcom/google/android/gms/drive/query/internal/MatchAllFilter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/drive/query/internal/ComparisonFilter",
            "<*>;",
            "Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;",
            "Lcom/google/android/gms/drive/query/internal/LogicalFilter;",
            "Lcom/google/android/gms/drive/query/internal/NotFilter;",
            "Lcom/google/android/gms/drive/query/internal/InFilter",
            "<*>;",
            "Lcom/google/android/gms/drive/query/internal/MatchAllFilter;",
            "Lcom/google/android/gms/drive/query/internal/HasFilter",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .local p2, "comparisonField":Lcom/google/android/gms/drive/query/internal/ComparisonFilter;, "Lcom/google/android/gms/drive/query/internal/ComparisonFilter<*>;"
    .local p6, "containsFilter":Lcom/google/android/gms/drive/query/internal/InFilter;, "Lcom/google/android/gms/drive/query/internal/InFilter<*>;"
    .local p8, "hasFilter":Lcom/google/android/gms/drive/query/internal/HasFilter;, "Lcom/google/android/gms/drive/query/internal/HasFilter<*>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->xM:I

    iput-object p2, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KP:Lcom/google/android/gms/drive/query/internal/ComparisonFilter;

    iput-object p3, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KQ:Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;

    iput-object p4, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KR:Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    iput-object p5, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KS:Lcom/google/android/gms/drive/query/internal/NotFilter;

    iput-object p6, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KT:Lcom/google/android/gms/drive/query/internal/InFilter;

    iput-object p7, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KU:Lcom/google/android/gms/drive/query/internal/MatchAllFilter;

    iput-object p8, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KV:Lcom/google/android/gms/drive/query/internal/HasFilter;

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KP:Lcom/google/android/gms/drive/query/internal/ComparisonFilter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KP:Lcom/google/android/gms/drive/query/internal/ComparisonFilter;

    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KW:Lcom/google/android/gms/drive/query/Filter;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KQ:Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KQ:Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;

    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KW:Lcom/google/android/gms/drive/query/Filter;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KR:Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KR:Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KW:Lcom/google/android/gms/drive/query/Filter;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KS:Lcom/google/android/gms/drive/query/internal/NotFilter;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KS:Lcom/google/android/gms/drive/query/internal/NotFilter;

    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KW:Lcom/google/android/gms/drive/query/Filter;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KT:Lcom/google/android/gms/drive/query/internal/InFilter;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KT:Lcom/google/android/gms/drive/query/internal/InFilter;

    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KW:Lcom/google/android/gms/drive/query/Filter;

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KU:Lcom/google/android/gms/drive/query/internal/MatchAllFilter;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KU:Lcom/google/android/gms/drive/query/internal/MatchAllFilter;

    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KW:Lcom/google/android/gms/drive/query/Filter;

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KV:Lcom/google/android/gms/drive/query/internal/HasFilter;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KV:Lcom/google/android/gms/drive/query/internal/HasFilter;

    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KW:Lcom/google/android/gms/drive/query/Filter;

    goto :goto_0

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "At least one filter must be set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/query/Filter;)V
    .locals 2
    .param p1, "filter"    # Lcom/google/android/gms/drive/query/Filter;

    .prologue
    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->xM:I

    instance-of v0, p1, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/drive/query/internal/ComparisonFilter;

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KP:Lcom/google/android/gms/drive/query/internal/ComparisonFilter;

    instance-of v0, p1, Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;

    :goto_1
    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KQ:Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;

    instance-of v0, p1, Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    :goto_2
    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KR:Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    instance-of v0, p1, Lcom/google/android/gms/drive/query/internal/NotFilter;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/drive/query/internal/NotFilter;

    :goto_3
    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KS:Lcom/google/android/gms/drive/query/internal/NotFilter;

    instance-of v0, p1, Lcom/google/android/gms/drive/query/internal/InFilter;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/drive/query/internal/InFilter;

    :goto_4
    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KT:Lcom/google/android/gms/drive/query/internal/InFilter;

    instance-of v0, p1, Lcom/google/android/gms/drive/query/internal/MatchAllFilter;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/drive/query/internal/MatchAllFilter;

    :goto_5
    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KU:Lcom/google/android/gms/drive/query/internal/MatchAllFilter;

    instance-of v0, p1, Lcom/google/android/gms/drive/query/internal/HasFilter;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/drive/query/internal/HasFilter;

    :goto_6
    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KV:Lcom/google/android/gms/drive/query/internal/HasFilter;

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KP:Lcom/google/android/gms/drive/query/internal/ComparisonFilter;

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KQ:Lcom/google/android/gms/drive/query/internal/FieldOnlyFilter;

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KR:Lcom/google/android/gms/drive/query/internal/LogicalFilter;

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KS:Lcom/google/android/gms/drive/query/internal/NotFilter;

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KT:Lcom/google/android/gms/drive/query/internal/InFilter;

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KU:Lcom/google/android/gms/drive/query/internal/MatchAllFilter;

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KV:Lcom/google/android/gms/drive/query/internal/HasFilter;

    if-nez v0, :cond_7

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid filter type or null filter."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    move-object v0, v1

    goto :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_2

    :cond_3
    move-object v0, v1

    goto :goto_3

    :cond_4
    move-object v0, v1

    goto :goto_4

    :cond_5
    move-object v0, v1

    goto :goto_5

    :cond_6
    move-object v0, v1

    goto :goto_6

    :cond_7
    iput-object p1, p0, Lcom/google/android/gms/drive/query/internal/FilterHolder;->KW:Lcom/google/android/gms/drive/query/Filter;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/internal/d;->a(Lcom/google/android/gms/drive/query/internal/FilterHolder;Landroid/os/Parcel;I)V

    return-void
.end method
