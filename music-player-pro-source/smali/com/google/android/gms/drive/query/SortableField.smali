.class public Lcom/google/android/gms/drive/query/SortableField;
.super Ljava/lang/Object;


# static fields
.field public static final CREATED_DATE:Lcom/google/android/gms/drive/metadata/SortableMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SortableMetadataField",
            "<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final LAST_VIEWED_BY_ME:Lcom/google/android/gms/drive/metadata/SortableMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SortableMetadataField",
            "<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final MODIFIED_BY_ME_DATE:Lcom/google/android/gms/drive/metadata/SortableMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SortableMetadataField",
            "<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final MODIFIED_DATE:Lcom/google/android/gms/drive/metadata/SortableMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SortableMetadataField",
            "<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final QUOTA_USED:Lcom/google/android/gms/drive/metadata/SortableMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SortableMetadataField",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final SHARED_WITH_ME_DATE:Lcom/google/android/gms/drive/metadata/SortableMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SortableMetadataField",
            "<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public static final TITLE:Lcom/google/android/gms/drive/metadata/SortableMetadataField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/SortableMetadataField",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ln;->RJ:Lcom/google/android/gms/internal/ln$g;

    sput-object v0, Lcom/google/android/gms/drive/query/SortableField;->TITLE:Lcom/google/android/gms/drive/metadata/SortableMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/lp;->RQ:Lcom/google/android/gms/internal/lp$a;

    sput-object v0, Lcom/google/android/gms/drive/query/SortableField;->CREATED_DATE:Lcom/google/android/gms/drive/metadata/SortableMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/lp;->RS:Lcom/google/android/gms/internal/lp$d;

    sput-object v0, Lcom/google/android/gms/drive/query/SortableField;->MODIFIED_DATE:Lcom/google/android/gms/drive/metadata/SortableMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/lp;->RT:Lcom/google/android/gms/internal/lp$c;

    sput-object v0, Lcom/google/android/gms/drive/query/SortableField;->MODIFIED_BY_ME_DATE:Lcom/google/android/gms/drive/metadata/SortableMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/lp;->RR:Lcom/google/android/gms/internal/lp$b;

    sput-object v0, Lcom/google/android/gms/drive/query/SortableField;->LAST_VIEWED_BY_ME:Lcom/google/android/gms/drive/metadata/SortableMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/lp;->RU:Lcom/google/android/gms/internal/lp$e;

    sput-object v0, Lcom/google/android/gms/drive/query/SortableField;->SHARED_WITH_ME_DATE:Lcom/google/android/gms/drive/metadata/SortableMetadataField;

    sget-object v0, Lcom/google/android/gms/internal/ln;->RG:Lcom/google/android/gms/internal/ln$e;

    sput-object v0, Lcom/google/android/gms/drive/query/SortableField;->QUOTA_USED:Lcom/google/android/gms/drive/metadata/SortableMetadataField;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
